package com.example.focustimer.presentation.splash

import android.animation.ValueAnimator
import android.content.Intent
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.example.focustimer.databinding.ActivitySplashBinding
import com.example.focustimer.presentation.main.MainActivity
import kotlinx.coroutines.*

/**
 * Modern and elegant splash screen with animated gradient background
 * and smooth fade-in logo + text transitions.
 */
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private val splashScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAnimatedBackground()
        animateLogoAndTitle()

        // Navigate to main screen
        splashScope.launch {
            delay(2500)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }

    private fun setupAnimatedBackground() {
        // initial gradient
        val gradient = GradientDrawable(
            GradientDrawable.Orientation.BL_TR,
            intArrayOf(0xFF1A237E.toInt(), 0xFF0D47A1.toInt(), 0xFF1565C0.toInt())
        )
        binding.root.background = gradient

        // subtle color animation loop
        ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 3500
            repeatCount = ValueAnimator.INFINITE
            repeatMode = ValueAnimator.REVERSE
            interpolator = AccelerateDecelerateInterpolator()
            addUpdateListener { animator ->
                val f = animator.animatedFraction
                val c1 = lerpColor(0xFF1A237E.toInt(), 0xFF283593.toInt(), f)
                val c2 = lerpColor(0xFF0D47A1.toInt(), 0xFF1976D2.toInt(), f)
                val c3 = lerpColor(0xFF1565C0.toInt(), 0xFF42A5F5.toInt(), f)
                gradient.colors = intArrayOf(c1, c2, c3)
            }
            start()
        }
    }

    private fun animateLogoAndTitle() {
        // logo animation
        binding.logo.apply {
            alpha = 0f
            scaleX = 0.6f
            scaleY = 0.6f
            animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(1200)
                .setInterpolator(AccelerateDecelerateInterpolator())
                .start()
        }

        // text animation
        binding.textAppName.apply {
            alpha = 0f
            translationY = 50f
            animate()
                .alpha(1f)
                .translationY(0f)
                .setStartDelay(1000)
                .setDuration(700)
                .setInterpolator(AccelerateDecelerateInterpolator())
                .start()
        }
    }

    private fun lerpColor(startColor: Int, endColor: Int, fraction: Float): Int {
        val sA = (startColor shr 24) and 0xff
        val sR = (startColor shr 16) and 0xff
        val sG = (startColor shr 8) and 0xff
        val sB = startColor and 0xff

        val eA = (endColor shr 24) and 0xff
        val eR = (endColor shr 16) and 0xff
        val eG = (endColor shr 8) and 0xff
        val eB = endColor and 0xff

        val a = (sA + ((eA - sA) * fraction)).toInt()
        val r = (sR + ((eR - sR) * fraction)).toInt()
        val g = (sG + ((eG - sG) * fraction)).toInt()
        val b = (sB + ((eB - sB) * fraction)).toInt()

        return (a shl 24) or (r shl 16) or (g shl 8) or b
    }

    override fun onDestroy() {
        splashScope.cancel()
        super.onDestroy()
    }
}
