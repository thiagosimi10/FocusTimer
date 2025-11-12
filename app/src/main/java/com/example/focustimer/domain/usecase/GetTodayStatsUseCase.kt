package com.example.focustimer.domain.usecase

import com.example.focustimer.domain.repository.FocusRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Use case to obtain the total focused minutes for the current day.
 */
class GetTodayStatsUseCase(private val repository: FocusRepository) {
    suspend operator fun invoke(): Int = withContext(Dispatchers.IO) {
        repository.getTodayMinutes()
    }
}