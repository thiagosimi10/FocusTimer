package com.example.focustimer.data.repository;

/**
 * Concrete implementation of [FocusRepository] backed by a Room database.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016J\u000e\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\u0010J\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0013H\u0002J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/focustimer/data/repository/FocusRepositoryImpl;", "Lcom/example/focustimer/domain/repository/FocusRepository;", "dao", "Lcom/example/focustimer/data/local/FocusSessionDao;", "(Lcom/example/focustimer/data/local/FocusSessionDao;)V", "clearSessions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSessions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/focustimer/domain/model/FocusSession;", "getTodayMinutes", "", "insertSession", "session", "(Lcom/example/focustimer/domain/model/FocusSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSession", "toDomain", "Lcom/example/focustimer/data/local/FocusSessionEntity;", "toEntity", "app_debug"})
public final class FocusRepositoryImpl implements com.example.focustimer.domain.repository.FocusRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.focustimer.data.local.FocusSessionDao dao = null;
    
    public FocusRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.data.local.FocusSessionDao dao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSession(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.domain.model.FocusSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateSession(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.domain.model.FocusSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearSessions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.focustimer.domain.model.FocusSession>> getAllSessions() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTodayMinutes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final com.example.focustimer.data.local.FocusSessionEntity toEntity(com.example.focustimer.domain.model.FocusSession $this$toEntity) {
        return null;
    }
    
    private final com.example.focustimer.domain.model.FocusSession toDomain(com.example.focustimer.data.local.FocusSessionEntity $this$toDomain) {
        return null;
    }
}