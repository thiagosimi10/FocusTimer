package com.example.focustimer.domain.usecase

import com.example.focustimer.domain.repository.FocusRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Use case to delete all existing sessions from the repository.
 */
class ClearSessionsUseCase(private val repository: FocusRepository) {
    suspend operator fun invoke() {
        withContext(Dispatchers.IO) {
            repository.clearSessions()
        }
    }
}