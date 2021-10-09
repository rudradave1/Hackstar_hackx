package com.rudra.schoolattendance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var loginButton: Button
    lateinit var usernameEditText: EditText
    lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginButton = findViewById(R.id.loginButton)
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)

        loginButton.setOnClickListener{
            if (isValidated()) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun isValidated(): Boolean {
        if (usernameEditText.text.toString().isBlank()) {
            usernameEditText.error = "Username can't be empty!"
            return false
        }
        if (passwordEditText.text.toString().isBlank()) {
            passwordEditText.error = "Password can't be empty!"
            return false
        }

        return true
    }
}