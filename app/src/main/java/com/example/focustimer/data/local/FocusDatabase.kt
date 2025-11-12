package com.example.focustimer.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * The Room database that holds focus sessions. It ties together the entities and the DAO.
 */
@Database(entities = [FocusSessionEntity::class], version = 1, exportSchema = false)
abstract class FocusDatabase : RoomDatabase() {
    abstract fun focusSessionDao(): FocusSessionDao
}