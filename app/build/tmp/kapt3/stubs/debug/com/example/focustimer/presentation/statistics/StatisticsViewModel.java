package com.example.focustimer.presentation.statistics;

/**
 * ViewModel responsible for fetching statistics data and exposing it as LiveData
 * for the StatisticsActivity.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lcom/example/focustimer/presentation/statistics/StatisticsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_sessions", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/focustimer/domain/model/FocusSession;", "_todayMinutes", "", "clearSessionsUseCase", "Lcom/example/focustimer/domain/usecase/ClearSessionsUseCase;", "getAllSessionsUseCase", "Lcom/example/focustimer/domain/usecase/GetAllSessionsUseCase;", "getTodayStatsUseCase", "Lcom/example/focustimer/domain/usecase/GetTodayStatsUseCase;", "sessions", "Landroidx/lifecycle/LiveData;", "getSessions", "()Landroidx/lifecycle/LiveData;", "todayMinutes", "getTodayMinutes", "clearSessions", "", "loadData", "app_debug"})
public final class StatisticsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.focustimer.domain.usecase.GetAllSessionsUseCase getAllSessionsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.focustimer.domain.usecase.GetTodayStatsUseCase getTodayStatsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.focustimer.domain.usecase.ClearSessionsUseCase clearSessionsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.focustimer.domain.model.FocusSession>> _sessions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.focustimer.domain.model.FocusSession>> sessions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _todayMinutes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> todayMinutes = null;
    
    public StatisticsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.focustimer.domain.model.FocusSession>> getSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTodayMinutes() {
        return null;
    }
    
    /**
     * Begin collecting sessions and today's minutes from the repository.
     */
    public final void loadData() {
    }
    
    /**
     * Delete all sessions from the repository.
     */
    public final void clearSessions() {
    }
}