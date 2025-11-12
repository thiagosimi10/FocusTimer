package com.example.focustimer.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Database entity that mirrors [com.example.focustimer.domain.model.FocusSession].
 */
@Entity(tableName = "focus_sessions")
data class FocusSessionEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val startTime: Long,
    val endTime: Long? = null,
    val durationMinutes: Int? = null
)