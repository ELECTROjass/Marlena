package com.example.marlena

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class PerfilActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private lateinit var textViewNombre: TextView
    private lateinit var textViewApellido: TextView
    private lateinit var textViewEdad: TextView
    private lateinit var textViewSexo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil)

        val inicio: Button = findViewById(R.id.button62)
        inicio.setOnClickListener {
            val intent: Intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }

        textViewNombre = findViewById(R.id.textViewNombre)
        textViewApellido = findViewById(R.id.textViewApellido)
        textViewEdad = findViewById(R.id.textViewEdad)
        textViewSexo = findViewById(R.id.textViewSexo)

        val userIdTay = "9BrA1AtQv2kUIwIKRZfj"
        //val userIdJei = "MSw4a1aSjqNHd81tp8XM"
        //val userIdJan = "b4zaFHxyE2ibgF8eu4Y2"

        db.collection("usuario")
            .document(userIdTay)
            .get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val id = document.getString("id")
                    val nombre = document.getString("nombre")
                    val apellido = document.getString("apellido")
                    val edad = document.getDouble("edad")
                    val sexo = document.getString("sexo")

                    textViewNombre.text = nombre
                    textViewApellido.text = apellido
                    textViewEdad.text = edad.toString()
                    textViewSexo.text = sexo

                } else {
                    Log.d(TAG, "No se encontró el documento")
                }
            }
            .addOnFailureListener { exception ->
                Log.d(TAG, "Error al obtener el documento:", exception)
            }

        }
    companion object {
            private const val TAG = "PerfilActivity"
    }
}