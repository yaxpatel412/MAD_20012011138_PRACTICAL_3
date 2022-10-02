package com.example.mad_20012011138_practical_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.mad_20012011138_practical_3.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val signup = findViewById<TextView>(R.id.signup)
        signup.setOnClickListener {
            Intent(this, RegistrationActivity::class.java).also(){startActivity(it)}
            signup.movementMethod =
                LinkMovementMethod.getInstance();
        }
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
        binding.bottomNavigationView.setOnItemSelectedListener { it
            when (it.itemId) {
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also{ startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}