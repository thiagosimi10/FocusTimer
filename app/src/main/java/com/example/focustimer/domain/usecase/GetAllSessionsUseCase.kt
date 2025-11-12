package com.example.focustimer.domain.usecase

import com.example.focustimer.domain.model.FocusSession
import com.example.focustimer.domain.repository.FocusRepository
import kotlinx.coroutines.flow.Flow

/**
 * Use case to return a Flow of all focus sessions.
 */
class GetAllSessionsUseCase(private val repository: FocusRepository) {
    operator fun invoke(): Flow<List<FocusSession>> = repository.getAllSessions()
}