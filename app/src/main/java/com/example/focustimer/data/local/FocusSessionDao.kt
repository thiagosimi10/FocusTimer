package com.example.focustimer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for managing focus sessions in the Room database.
 */
@Dao
interface FocusSessionDao {
    @Insert
    suspend fun insert(session: FocusSessionEntity)

    @Update
    suspend fun update(session: FocusSessionEntity)

    @Query("DELETE FROM focus_sessions")
    suspend fun deleteAll()

    @Query("SELECT * FROM focus_sessions ORDER BY startTime DESC")
    fun getAllSessions(): Flow<List<FocusSessionEntity>>

    // Calculates the sum of durationMinutes for the current day using SQL date functions
    @Query(
        "SELECT IFNULL(SUM(durationMinutes), 0) FROM focus_sessions " +
                "WHERE date(startTime/1000, 'unixepoch', 'localtime') = date('now', 'localtime')"
    )
    suspend fun getTodayTotalMinutes(): Int
}