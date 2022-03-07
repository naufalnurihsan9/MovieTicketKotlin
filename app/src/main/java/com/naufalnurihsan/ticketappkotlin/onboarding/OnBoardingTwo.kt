package com.naufalnurihsan.ticketappkotlin.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.naufalnurihsan.ticketappkotlin.R
import kotlinx.android.synthetic.main.activity_on_boarding_one.*
import kotlinx.android.synthetic.main.activity_on_boarding_two.*


class OnBoardingTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_two)

        btn_next_OnBoardingTwo.setOnClickListener {
            var intent = Intent(this@OnBoardingTwo, OnBoardingThree::class.java)
            startActivity(intent)
        }
    }
}