package com.example.focustimer.presentation.statistics;

/**
 * Adapter for displaying a list of focus sessions in a RecyclerView.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/focustimer/presentation/statistics/FocusSessionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/focustimer/presentation/statistics/FocusSessionAdapter$SessionViewHolder;", "()V", "sessions", "", "Lcom/example/focustimer/domain/model/FocusSession;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newSessions", "", "SessionViewHolder", "app_debug"})
public final class FocusSessionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.focustimer.presentation.statistics.FocusSessionAdapter.SessionViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.focustimer.domain.model.FocusSession> sessions = null;
    
    public FocusSessionAdapter() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.focustimer.presentation.statistics.FocusSessionAdapter.SessionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.focustimer.presentation.statistics.FocusSessionAdapter.SessionViewHolder holder, int position) {
    }
    
    /**
     * Replace the current list of sessions with a new one.
     */
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.focustimer.domain.model.FocusSession> newSessions) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/focustimer/presentation/statistics/FocusSessionAdapter$SessionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "dateFormat", "Ljava/text/SimpleDateFormat;", "durationTextView", "Landroid/widget/TextView;", "timeTextView", "bind", "", "session", "Lcom/example/focustimer/domain/model/FocusSession;", "app_debug"})
    public static final class SessionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final java.text.SimpleDateFormat dateFormat = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView timeTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView durationTextView = null;
        
        public SessionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.focustimer.domain.model.FocusSession session) {
        }
    }
}