package com.example.focustimer.data.local;

/**
 * Database entity that mirrors [com.example.focustimer.domain.model.FocusSession].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/example/focustimer/data/local/FocusSessionEntity;", "", "id", "", "startTime", "", "endTime", "durationMinutes", "(IJLjava/lang/Long;Ljava/lang/Integer;)V", "getDurationMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()I", "getStartTime", "()J", "component1", "component2", "component3", "component4", "copy", "(IJLjava/lang/Long;Ljava/lang/Integer;)Lcom/example/focustimer/data/local/FocusSessionEntity;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "focus_sessions")
public final class FocusSessionEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    private final long startTime = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long endTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer durationMinutes = null;
    
    public FocusSessionEntity(int id, long startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long endTime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer durationMinutes) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final long getStartTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEndTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDurationMinutes() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.focustimer.data.local.FocusSessionEntity copy(int id, long startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long endTime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer durationMinutes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}