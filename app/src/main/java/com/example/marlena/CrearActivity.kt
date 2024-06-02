package com.example.marlena

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CrearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crear)

        val inicio: Button = findViewById(R.id.button37)
        inicio.setOnClickListener {
            val intent: Intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }
        val market: Button = findViewById(R.id.button34)
        market.setOnClickListener {
            val intent: Intent = Intent(this, MarketActivity::class.java)
            startActivity(intent)
        }
        val crear: Button = findViewById(R.id.button36)
        crear.setOnClickListener {
            val intent: Intent = Intent(this, CrearActivity::class.java)
            startActivity(intent)
        }
    }
}