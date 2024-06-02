package com.example.marlena

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.button3)
        btn1.setOnClickListener {
            val intent: Intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button4)
        btn2.setOnClickListener {
            val intent1: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

    }
}