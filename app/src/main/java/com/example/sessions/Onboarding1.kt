package com.example.sessions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val skipButton: Button = findViewById(R.id.button_skip) // Получаем ссылку на кнопку
        skipButton.setOnClickListener {
            val intent = Intent(this, Onboarding3::class.java) // Создаем Intent для перехода на Onboarding3
            startActivity(intent) // Запускаем Onboarding3
        }

        val nextButton: Button = findViewById(R.id.button_next)
        nextButton.setOnClickListener {
            val intent = Intent(this, Onboarding4::class.java)
            startActivity(intent)
        }
    }
}