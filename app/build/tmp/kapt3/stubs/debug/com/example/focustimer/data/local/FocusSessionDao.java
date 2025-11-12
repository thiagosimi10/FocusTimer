package com.example.focustimer.data.local;

/**
 * Data Access Object for managing focus sessions in the Room database.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u000e\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/example/focustimer/data/local/FocusSessionDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSessions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/focustimer/data/local/FocusSessionEntity;", "getTodayTotalMinutes", "", "insert", "session", "(Lcom/example/focustimer/data/local/FocusSessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface FocusSessionDao {
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.data.local.FocusSessionEntity session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.data.local.FocusSessionEntity session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM focus_sessions")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM focus_sessions ORDER BY startTime DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.focustimer.data.local.FocusSessionEntity>> getAllSessions();
    
    @androidx.room.Query(value = "SELECT IFNULL(SUM(durationMinutes), 0) FROM focus_sessions WHERE date(startTime/1000, \'unixepoch\', \'localtime\') = date(\'now\', \'localtime\')")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodayTotalMinutes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}