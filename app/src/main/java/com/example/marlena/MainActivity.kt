package com.example.marlena

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUser: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var editTextId: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn2: Button = findViewById(R.id.button4)
        btn2.setOnClickListener {
            val intent1: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        val btn3: Button = findViewById(R.id.button3)
        btn3.setOnClickListener {
            val intent1: Intent = Intent(this, InicioActivity::class.java)
            startActivity(intent1)
        }

        //editTextUser = findViewById(R.id.editTextUser)
        //editTextPassword = findViewById(R.id.editTextPassword)
        //editTextId = findViewById(R.id.editTextId)

        //findViewById<Button>(R.id.button3).setOnClickListener {
            //val correo = editTextUser.text.toString()
            //val contrasena = editTextPassword.text.toString()
            //val usuarioId = editTextId.text.toString()

            //val btnIniciar: Button = findViewById(R.id.button3)
            //btnIniciar.setOnClickListener {
            //if (correo == "taylor@gmail.com" && contrasena == "123456" && usuarioId == "9BrA1AtQv2kUIwIKRZfj") {
            //val intent: Intent = Intent(this, InicioActivity::class.java)
            //startActivity(intent)
                } //else {
        //val intent: Intent = Intent(this, MainActivity::class.java)
        //startActivity(intent)
                //}
    //}
            //finish()
    //}
    //}
}
