package com.example.marlena

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MarketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.market_plant)

        val inicio: Button = findViewById(R.id.button6)
        inicio.setOnClickListener {
            val intent: Intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }
        val market: Button = findViewById(R.id.button5)
        market.setOnClickListener {
            val intent: Intent = Intent(this, MarketActivity::class.java)
            startActivity(intent)
        }
        val crear: Button = findViewById(R.id.button7)
        crear.setOnClickListener {
            val intent: Intent = Intent(this, CrearActivity::class.java)
            startActivity(intent)
        }
    }
}