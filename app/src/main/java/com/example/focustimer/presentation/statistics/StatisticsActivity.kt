package com.example.focustimer.presentation.statistics

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.focustimer.databinding.ActivityStatisticsBinding

/**
 * Activity that displays historical focus sessions and today's total focused minutes.
 */
class StatisticsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStatisticsBinding
    private val viewModel: StatisticsViewModel by viewModels()
    private val adapter = FocusSessionAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatisticsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup RecyclerView
        binding.recyclerViewSessions.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewSessions.adapter = adapter

        // Observe session list
        viewModel.sessions.observe(this) { list ->
            adapter.submitList(list)
        }

        // Observe today's minutes
        viewModel.todayMinutes.observe(this) { minutes ->
            binding.textViewTotalMinutes.text = "$minutes min focused today"
        }

        // Refresh data when resumed
        viewModel.loadData()

        // Clear history on button press
        binding.buttonClear.setOnClickListener {
            viewModel.clearSessions()
        }
    }
}