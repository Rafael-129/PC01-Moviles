package com.garcia.rafael.laboratoriocalificado01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ejercicio = Ejercicio01Kotlin()

        val resultado1 = ejercicio.sonAnagramas("listen", "silent")
        val resultado2 = ejercicio.sonAnagramas("hello", "world")

        // Buscar los TextViews por su ID
        val textResultadoAnagrama1 = findViewById<TextView>(R.id.resultadoAnagrama1)
        val textResultadoAnagrama2 = findViewById<TextView>(R.id.resultadoAnagrama2)

        // Mostrar los resultados en los TextViews correspondientes
        textResultadoAnagrama1.text = "¿'listen' y 'silent' son anagramas? $resultado1"
        textResultadoAnagrama2.text = "¿'hello' y 'world' son anagramas? $resultado2"

        // Prueba de contar vocales
        val ejercicio2 = Ejercicio02Kotlin()

        val conteo1 = ejercicio2.contarVocales("Hola mundo")
        val conteo2 = ejercicio2.contarVocales("Kotlin es genial")

        // Buscar los TextViews para el conteo de vocales
        val textConteoVocales1 = findViewById<TextView>(R.id.conteoVocales1)
        val textConteoVocales2 = findViewById<TextView>(R.id.conteoVocales2)

        // Mostrar los resultados del conteo de vocales
        textConteoVocales1.text = "Número de vocales en 'Hola mundo': $conteo1"
        textConteoVocales2.text = "Número de vocales en 'Kotlin es genial': $conteo2"

        // BOTÓN PARA IR A EJERCICIO01
        val btnIrAEjercicio01 = findViewById<Button>(R.id.btnIrAEjercicio01)

        btnIrAEjercicio01.setOnClickListener {
            val intent = Intent(this, Ejercicio01Activity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

