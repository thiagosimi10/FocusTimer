package com.example.focustimer.domain.usecase

import com.example.focustimer.domain.model.FocusSession
import com.example.focustimer.domain.repository.FocusRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Use case to finish the most recent focus session. The session must be passed in
 * as a [FocusSession] with a start time; this will set its end time and duration
 * before updating it in the repository.
 */
class EndFocusSessionUseCase(private val repository: FocusRepository) {
    /**
     * Saves a completed focus session by calculating its end time and duration.
     * This will insert the updated session into the repository rather than updating
     * an existing one. Incomplete sessions are not persisted.
     */
    suspend operator fun invoke(session: FocusSession) {
        withContext(Dispatchers.IO) {
            val endTime = System.currentTimeMillis()
            // Calculate duration in minutes
            val minutes = ((endTime - session.startTime) / 1000 / 60).toInt()
            val updated = session.copy(endTime = endTime, durationMinutes = minutes)
            repository.insertSession(updated)
        }
    }
}