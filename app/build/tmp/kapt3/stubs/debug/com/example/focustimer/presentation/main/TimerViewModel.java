package com.example.focustimer.presentation.main;

/**
 * ViewModel responsible for handling the timer logic and persisting focus sessions.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/focustimer/presentation/main/TimerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_timeLeft", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "currentSessionLength", "endUseCase", "Lcom/example/focustimer/domain/usecase/EndFocusSessionUseCase;", "isRunning", "", "sessionStartTime", "", "Ljava/lang/Long;", "timeLeft", "Landroidx/lifecycle/LiveData;", "getTimeLeft", "()Landroidx/lifecycle/LiveData;", "timer", "Landroid/os/CountDownTimer;", "completeSession", "", "formatTime", "", "seconds", "resetTimer", "setCustomSession", "startTimer", "totalSeconds", "Companion", "app_debug"})
public final class TimerViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.focustimer.domain.usecase.EndFocusSessionUseCase endUseCase = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.CountDownTimer timer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long sessionStartTime;
    private boolean isRunning = false;
    private int currentSessionLength = 1500;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _timeLeft = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> timeLeft = null;
    private static final int DEFAULT_SESSION_LENGTH = 1500;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.focustimer.presentation.main.TimerViewModel.Companion Companion = null;
    
    public TimerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTimeLeft() {
        return null;
    }
    
    /**
     * Inicia o timer com o tempo configurado (ou customizado).
     */
    public final void startTimer(int totalSeconds) {
    }
    
    /**
     * Reinicia o timer pro valor atual (não o padrão fixo).
     */
    public final void resetTimer() {
    }
    
    /**
     * Completa a sessão e salva.
     */
    private final void completeSession() {
    }
    
    /**
     * Atualiza o tempo configurado pelo usuário.
     */
    public final void setCustomSession(int seconds) {
    }
    
    /**
     * Formata o tempo como mm:ss.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatTime(int seconds) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/focustimer/presentation/main/TimerViewModel$Companion;", "", "()V", "DEFAULT_SESSION_LENGTH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}