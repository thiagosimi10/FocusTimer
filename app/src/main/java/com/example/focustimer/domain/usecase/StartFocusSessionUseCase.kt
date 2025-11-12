package com.example.focustimer.domain.usecase

import com.example.focustimer.domain.model.FocusSession
import com.example.focustimer.domain.repository.FocusRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Use case to start a new focus session. This inserts a new session into the repository
 * with the current timestamp as its start time.
 */
class StartFocusSessionUseCase(private val repository: FocusRepository) {
    suspend operator fun invoke() {
        withContext(Dispatchers.IO) {
            val session = FocusSession(
                startTime = System.currentTimeMillis()
            )
            repository.insertSession(session)
        }
    }
}