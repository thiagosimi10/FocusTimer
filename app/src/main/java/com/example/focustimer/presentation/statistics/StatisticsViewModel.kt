package com.example.focustimer.presentation.statistics

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.focustimer.FocusTimerApp
import com.example.focustimer.domain.model.FocusSession
import com.example.focustimer.domain.usecase.ClearSessionsUseCase
import com.example.focustimer.domain.usecase.GetAllSessionsUseCase
import com.example.focustimer.domain.usecase.GetTodayStatsUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * ViewModel responsible for fetching statistics data and exposing it as LiveData
 * for the StatisticsActivity.
 */
class StatisticsViewModel(application: Application) : AndroidViewModel(application) {

    private val getAllSessionsUseCase: GetAllSessionsUseCase
    private val getTodayStatsUseCase: GetTodayStatsUseCase
    private val clearSessionsUseCase: ClearSessionsUseCase

    private val _sessions = MutableLiveData<List<FocusSession>>()
    val sessions: LiveData<List<FocusSession>> = _sessions

    private val _todayMinutes = MutableLiveData<Int>()
    val todayMinutes: LiveData<Int> = _todayMinutes

    init {
        val repository = (application as FocusTimerApp).repository
        getAllSessionsUseCase = GetAllSessionsUseCase(repository)
        getTodayStatsUseCase = GetTodayStatsUseCase(repository)
        clearSessionsUseCase = ClearSessionsUseCase(repository)
        loadData()
    }

    /**
     * Begin collecting sessions and today's minutes from the repository.
     */
    fun loadData() {
        // Collect sessions
        viewModelScope.launch {
            getAllSessionsUseCase().collect { list ->
                _sessions.postValue(list)
            }
        }
        // Fetch today's total minutes
        viewModelScope.launch {
            val minutes = getTodayStatsUseCase()
            _todayMinutes.postValue(minutes)
        }
    }

    /**
     * Delete all sessions from the repository.
     */
    fun clearSessions() {
        viewModelScope.launch {
            clearSessionsUseCase()
        }
    }
}