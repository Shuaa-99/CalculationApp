package com.example.calculationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    private val splashScreentimeot: Long = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
Handler().postDelayed({
    startActivity(Intent(this, MainActivity::class.java))
    finish()
},splashScreentimeot)
    }
}