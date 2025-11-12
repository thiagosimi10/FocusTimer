package com.example.focustimer.presentation.main

import android.app.Application
import android.os.CountDownTimer
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.focustimer.FocusTimerApp
import com.example.focustimer.domain.model.FocusSession
import com.example.focustimer.domain.usecase.EndFocusSessionUseCase
import kotlinx.coroutines.launch

/**
 * ViewModel responsible for handling the timer logic and persisting focus sessions.
 */
class TimerViewModel(application: Application) : AndroidViewModel(application) {

    private val endUseCase: EndFocusSessionUseCase

    private var timer: CountDownTimer? = null
    private var sessionStartTime: Long? = null
    private var isRunning = false

    // Guarda o valor atual configurado (default = 25 minutos)
    private var currentSessionLength = DEFAULT_SESSION_LENGTH

    // LiveData para expor o tempo restante à UI
    private val _timeLeft = MutableLiveData(currentSessionLength)
    val timeLeft: LiveData<Int> = _timeLeft

    init {
        val repository = (application as FocusTimerApp).repository
        endUseCase = EndFocusSessionUseCase(repository)
    }

    /**
     * Inicia o timer com o tempo configurado (ou customizado).
     */
    fun startTimer(totalSeconds: Int = currentSessionLength) {
        if (isRunning) return
        isRunning = true
        sessionStartTime = System.currentTimeMillis()
        currentSessionLength = totalSeconds
        _timeLeft.value = totalSeconds

        timer = object : CountDownTimer(totalSeconds * 1000L, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                _timeLeft.value = (millisUntilFinished / 1000L).toInt()
            }

            override fun onFinish() {
                completeSession()
            }
        }.start()
    }

    /**
     * Reinicia o timer pro valor atual (não o padrão fixo).
     */
    fun resetTimer() {
        timer?.cancel()
        if (isRunning) {
            sessionStartTime?.let { startTime ->
                viewModelScope.launch {
                    endUseCase(FocusSession(startTime = startTime))
                }
            }
        }
        isRunning = false
        sessionStartTime = null
        _timeLeft.value = currentSessionLength // mantém o valor configurado
    }

    /**
     * Completa a sessão e salva.
     */
    private fun completeSession() {
        isRunning = false
        val startTime = sessionStartTime
        sessionStartTime = null
        startTime?.let {
            viewModelScope.launch {
                endUseCase(FocusSession(startTime = it))
            }
        }
        _timeLeft.postValue(currentSessionLength)
    }

    /**
     * Atualiza o tempo configurado pelo usuário.
     */
    fun setCustomSession(seconds: Int) {
        timer?.cancel()
        isRunning = false
        sessionStartTime = null
        currentSessionLength = seconds
        _timeLeft.value = seconds
    }

    /**
     * Formata o tempo como mm:ss.
     */
    fun formatTime(seconds: Int): String {
        val minutes = seconds / 60
        val secs = seconds % 60
        return String.format("%02d:%02d", minutes, secs)
    }

    companion object {
        private const val DEFAULT_SESSION_LENGTH = 25 * 60
    }
}
