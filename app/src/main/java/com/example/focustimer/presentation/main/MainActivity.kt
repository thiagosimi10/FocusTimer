package com.example.focustimer.presentation.main

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.focustimer.R
import com.example.focustimer.databinding.ActivityMainBinding
import com.example.focustimer.presentation.statistics.StatisticsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: TimerViewModel by viewModels()
    private var mediaPlayer: MediaPlayer? = null
    private var beepPlayer: MediaPlayer? = null
    private var defaultMinutes = 25 // tempo padrão

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // popula spinner com os sons
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.sound_options,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerSounds.adapter = adapter

        // observa o tempo restante
        viewModel.timeLeft.observe(this, Observer { seconds ->
            binding.textViewTimer.text = viewModel.formatTime(seconds)
            if (seconds <= 0) {
                playBeep()
                stopSound()
            }
        })

        // botão iniciar
        binding.buttonStart.setOnClickListener {
            viewModel.startTimer(defaultMinutes * 60)
            val soundResId = getSelectedSoundResource(binding.spinnerSounds.selectedItemPosition)
            playSound(soundResId)
        }

        // botão reset
        binding.buttonReset.setOnClickListener {
            viewModel.resetTimer()
            stopSound()
        }

        // botão de estatísticas
        binding.buttonStats.setOnClickListener {
            startActivity(Intent(this, StatisticsActivity::class.java))
        }

        // botão configurações
        binding.buttonSettings.setOnClickListener {
            showTimerSettingsDialog()
        }

        // botão fechar app
        binding.buttonClose.setOnClickListener {
            finishAffinity()
        }
    }

    private fun playSound(resId: Int) {
        stopSound()
        mediaPlayer = MediaPlayer.create(this, resId)
        mediaPlayer?.isLooping = true
        mediaPlayer?.start()
    }

    private fun stopSound() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    private fun playBeep() {
        beepPlayer?.release()
        beepPlayer = MediaPlayer.create(this, R.raw.beep)
        beepPlayer?.isLooping = false
        beepPlayer?.start()
    }

    private fun getSelectedSoundResource(position: Int): Int {
        return when (position) {
            0 -> R.raw.rain
            1 -> R.raw.forest
            2 -> R.raw.ocean
            3 -> R.raw.coffee
            4 -> R.raw.fireplace
            5 -> R.raw.wind
            6 -> R.raw.lofi
            7 -> R.raw.clock
            8 -> R.raw.monk
            else -> R.raw.storm
        }
    }

    private fun showTimerSettingsDialog() {
        val input = EditText(this)
        input.hint = "Minutos (ex: 25)"
        input.setText(defaultMinutes.toString())

        input.showSoftInputOnFocus = true
        input.customInsertionActionModeCallback = null
        input.customSelectionActionModeCallback = null
        input.isLongClickable = false
        input.setTextIsSelectable(false)

        AlertDialog.Builder(this)
            .setTitle("Configurar tempo")
            .setMessage("Defina o tempo (em minutos):")
            .setView(input)
            .setPositiveButton("Salvar") { _: DialogInterface, _: Int ->
                val newMinutes = input.text.toString().toIntOrNull()
                if (newMinutes != null && newMinutes > 0) {
                    defaultMinutes = newMinutes
                    viewModel.resetTimer()
                    val newSeconds = newMinutes * 60
                    viewModel.setCustomSession(newSeconds)
                    binding.textViewTimer.text = viewModel.formatTime(newSeconds)
                }
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }

    override fun onDestroy() {
        super.onDestroy()
        stopSound()
        beepPlayer?.release()
    }
}
