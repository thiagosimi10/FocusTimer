package com.example.focustimer.domain.model

/**
 * A domain model representing a single focus session. The session may represent
 * either an ongoing session (endTime == null) or a completed session with a
 * computed duration.
 */
data class FocusSession(
    val id: Int = 0,
    val startTime: Long,
    val endTime: Long? = null,
    val durationMinutes: Int? = null
)