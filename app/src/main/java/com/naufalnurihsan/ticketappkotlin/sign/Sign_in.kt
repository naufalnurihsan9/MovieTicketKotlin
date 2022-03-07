package com.naufalnurihsan.ticketappkotlin.sign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import com.naufalnurihsan.ticketappkotlin.R
import kotlinx.android.synthetic.main.activity_sign_in.*


class Sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btn_sign_in.setOnClickListener {// Write a message to the database
            // Write a message to the database
            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("message")

            myRef.setValue("Hello, World!")
        }
    }
}