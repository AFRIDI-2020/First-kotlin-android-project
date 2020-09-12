package com.example.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingBtn:Button = findViewById(R.id.greetingBtn)
        val greetingTV:TextView = findViewById(R.id.greetingTV)
        val orderBtn : Button = findViewById(R.id.orderBtn)
        val wishBtn:Button = findViewById(R.id.wishBtn)

        greetingBtn.setOnClickListener{
            greetingTV.text = "Welcome to Kotlin learing!"
        }

        orderBtn.setOnClickListener{
            greetingTV.text = "What do you want?"
        }

        wishBtn.setOnClickListener {
            greetingTV.text = "May Allah bless you."
        }
    }
}
