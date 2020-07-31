package io.github.fuadreza.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Dibuat dengan kerjakerasbagaiquda oleh Shifu pada tanggal 29/07/2020.
 *
 */
class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}