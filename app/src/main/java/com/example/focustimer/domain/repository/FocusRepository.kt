package com.example.focustimer.domain.repository

import com.example.focustimer.domain.model.FocusSession
import kotlinx.coroutines.flow.Flow

/**
 * Defines the contract for any data source that manages [FocusSession]s.
 */
interface FocusRepository {
    /** Insert a new session into the data source */
    suspend fun insertSession(session: FocusSession)

    /** Update a session to mark it as finished */
    suspend fun updateSession(session: FocusSession)

    /** Clear all sessions from the data source */
    suspend fun clearSessions()

    /** Return a Flow stream of all sessions */
    fun getAllSessions(): Flow<List<FocusSession>>

    /** Get total focused minutes for today */
    suspend fun getTodayMinutes(): Int
}