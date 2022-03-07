package com.naufalnurihsan.ticketappkotlin.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.naufalnurihsan.ticketappkotlin.R
import com.naufalnurihsan.ticketappkotlin.sign.Sign_in
import kotlinx.android.synthetic.main.activity_on_boarding_three.*
import kotlinx.android.synthetic.main.activity_on_boarding_two.*

class OnBoardingThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_three)

        btn_next_OnBoardingThree.setOnClickListener {
            finishAffinity()
            var intent = Intent(this@OnBoardingThree, Sign_in::class.java)
            startActivity(intent)
        }

    }
}