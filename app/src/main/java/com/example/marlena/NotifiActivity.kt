package com.example.marlena

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NotifiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notifi)

        val inicio: Button = findViewById(R.id.button47)
        inicio.setOnClickListener {
            val intent: Intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }
        val market: Button = findViewById(R.id.button44)
        market.setOnClickListener {
            val intent: Intent = Intent(this, MarketActivity::class.java)
            startActivity(intent)
        }
        val crear: Button = findViewById(R.id.button46)
        crear.setOnClickListener {
            val intent: Intent = Intent(this, CrearActivity::class.java)
            startActivity(intent)
        }
        val notifi: Button = findViewById(R.id.button45)
        notifi.setOnClickListener {
            val intent: Intent = Intent(this, NotifiActivity::class.java)
            startActivity(intent)
        }
        val ajustes: Button = findViewById(R.id.button42)
        ajustes.setOnClickListener {
            val intent: Intent = Intent(this, AjustesActivity::class.java)
            startActivity(intent)
        }
        val perfil: Button = findViewById(R.id.button43)
        perfil.setOnClickListener {
            val intent: Intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
        }
    }
}