package com.naufalnurihsan.ticketappkotlin.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.naufalnurihsan.ticketappkotlin.R
import com.naufalnurihsan.ticketappkotlin.sign.Sign_in
import kotlinx.android.synthetic.main.activity_on_boarding_one.*

class OnBoardingOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        btn_next_OnBoardingOne.setOnClickListener {
            var intent = Intent(this@OnBoardingOne, OnBoardingTwo::class.java)
            startActivity(intent)
        }

        btn_daftar.setOnClickListener {
            finishAffinity()
            var intent = Intent(this@OnBoardingOne, Sign_in::class.java)
            startActivity(intent)
        }
    }
}