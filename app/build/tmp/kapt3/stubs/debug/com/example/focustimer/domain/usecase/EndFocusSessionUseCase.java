package com.example.focustimer.domain.usecase;

/**
 * Use case to finish the most recent focus session. The session must be passed in
 * as a [FocusSession] with a start time; this will set its end time and duration
 * before updating it in the repository.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/focustimer/domain/usecase/EndFocusSessionUseCase;", "", "repository", "Lcom/example/focustimer/domain/repository/FocusRepository;", "(Lcom/example/focustimer/domain/repository/FocusRepository;)V", "invoke", "", "session", "Lcom/example/focustimer/domain/model/FocusSession;", "(Lcom/example/focustimer/domain/model/FocusSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class EndFocusSessionUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.focustimer.domain.repository.FocusRepository repository = null;
    
    public EndFocusSessionUseCase(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.domain.repository.FocusRepository repository) {
        super();
    }
    
    /**
     * Saves a completed focus session by calculating its end time and duration.
     * This will insert the updated session into the repository rather than updating
     * an existing one. Incomplete sessions are not persisted.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.domain.model.FocusSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}