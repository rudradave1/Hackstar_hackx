package com.rudra.schoolattendance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    lateinit var submitButton: Button
    lateinit var totalAttendanceTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        submitButton = findViewById(R.id.submitButton)
        totalAttendanceTextView = findViewById(R.id.totalAttendanceTextView)

        submitButton.setOnClickListener{
            val intent = Intent(this, TakeAttendanceActivity::class.java)
            startActivity(intent)
        }

    }
}