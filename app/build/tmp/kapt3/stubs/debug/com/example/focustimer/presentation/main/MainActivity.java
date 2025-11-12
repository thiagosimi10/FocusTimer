package com.example.focustimer.presentation.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/example/focustimer/presentation/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "beepPlayer", "Landroid/media/MediaPlayer;", "binding", "Lcom/example/focustimer/databinding/ActivityMainBinding;", "defaultMinutes", "", "mediaPlayer", "viewModel", "Lcom/example/focustimer/presentation/main/TimerViewModel;", "getViewModel", "()Lcom/example/focustimer/presentation/main/TimerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getSelectedSoundResource", "position", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "playBeep", "playSound", "resId", "showTimerSettingsDialog", "stopSound", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.focustimer.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.media.MediaPlayer mediaPlayer;
    @org.jetbrains.annotations.Nullable()
    private android.media.MediaPlayer beepPlayer;
    private int defaultMinutes = 25;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.focustimer.presentation.main.TimerViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void playSound(int resId) {
    }
    
    private final void stopSound() {
    }
    
    private final void playBeep() {
    }
    
    private final int getSelectedSoundResource(int position) {
        return 0;
    }
    
    private final void showTimerSettingsDialog() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}