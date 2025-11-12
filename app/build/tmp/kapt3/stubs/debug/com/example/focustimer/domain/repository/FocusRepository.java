package com.example.focustimer.domain.repository;

/**
 * Defines the contract for any data source that manages [FocusSession]s.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J\u000e\u0010\t\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/example/focustimer/domain/repository/FocusRepository;", "", "clearSessions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSessions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/focustimer/domain/model/FocusSession;", "getTodayMinutes", "", "insertSession", "session", "(Lcom/example/focustimer/domain/model/FocusSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSession", "app_debug"})
public abstract interface FocusRepository {
    
    /**
     * Insert a new session into the data source
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSession(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.domain.model.FocusSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Update a session to mark it as finished
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSession(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.domain.model.FocusSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Clear all sessions from the data source
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearSessions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Return a Flow stream of all sessions
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.focustimer.domain.model.FocusSession>> getAllSessions();
    
    /**
     * Get total focused minutes for today
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodayMinutes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}