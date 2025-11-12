package com.example.focustimer.data.repository

import com.example.focustimer.data.local.FocusSessionDao
import com.example.focustimer.data.local.FocusSessionEntity
import com.example.focustimer.domain.model.FocusSession
import com.example.focustimer.domain.repository.FocusRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Concrete implementation of [FocusRepository] backed by a Room database.
 */
class FocusRepositoryImpl(
    private val dao: FocusSessionDao
) : FocusRepository {

    override suspend fun insertSession(session: FocusSession) {
        dao.insert(session.toEntity())
    }

    override suspend fun updateSession(session: FocusSession) {
        dao.update(session.toEntity())
    }

    override suspend fun clearSessions() {
        dao.deleteAll()
    }

    override fun getAllSessions(): Flow<List<FocusSession>> {
        return dao.getAllSessions().map { list ->
            list.map { it.toDomain() }
        }
    }

    override suspend fun getTodayMinutes(): Int {
        return dao.getTodayTotalMinutes()
    }

    // Extension function to convert a domain model to an entity
    private fun FocusSession.toEntity(): FocusSessionEntity {
        return FocusSessionEntity(
            id = this.id,
            startTime = this.startTime,
            endTime = this.endTime,
            durationMinutes = this.durationMinutes
        )
    }

    // Extension function to convert an entity to a domain model
    private fun FocusSessionEntity.toDomain(): FocusSession {
        return FocusSession(
            id = this.id,
            startTime = this.startTime,
            endTime = this.endTime,
            durationMinutes = this.durationMinutes
        )
    }
}