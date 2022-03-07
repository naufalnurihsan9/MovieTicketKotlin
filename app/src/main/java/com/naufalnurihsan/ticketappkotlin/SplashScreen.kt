package com.naufalnurihsan.ticketappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.naufalnurihsan.ticketappkotlin.onboarding.OnBoardingOne

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)



        var handler = Handler();
        handler.postDelayed({
        var intent = Intent(this@SplashScreen, OnBoardingOne::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}