package com.example.focustimer.data.local;

/**
 * The Room database that holds focus sessions. It ties together the entities and the DAO.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/focustimer/data/local/FocusDatabase;", "Landroidx/room/RoomDatabase;", "()V", "focusSessionDao", "Lcom/example/focustimer/data/local/FocusSessionDao;", "app_debug"})
@androidx.room.Database(entities = {com.example.focustimer.data.local.FocusSessionEntity.class}, version = 1, exportSchema = false)
public abstract class FocusDatabase extends androidx.room.RoomDatabase {
    
    public FocusDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.focustimer.data.local.FocusSessionDao focusSessionDao();
}