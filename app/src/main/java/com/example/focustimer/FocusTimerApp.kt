package com.example.focustimer

import android.app.Application
import androidx.room.Room
import com.example.focustimer.data.local.FocusDatabase
import com.example.focustimer.data.repository.FocusRepositoryImpl
import com.example.focustimer.domain.repository.FocusRepository

/**
 * Application class that sets up singletons for the Room database and repository.
 * This allows the ViewModels to retrieve a consistent instance of the repository.
 */
class FocusTimerApp : Application() {

    // Expose the repository as a property so that it can be accessed from ViewModels
    lateinit var repository: FocusRepository
        private set

    override fun onCreate() {
        super.onCreate()
        // Build the Room database
        val database = Room.databaseBuilder(
            applicationContext,
            FocusDatabase::class.java,
            "focus_database"
        ).build()
        // Instantiate the repository implementation
        repository = FocusRepositoryImpl(database.focusSessionDao())
    }
}