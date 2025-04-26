package com.garcia.rafael.laboratoriocalificado01

class Ejercicio01Kotlin {

    // Función para verificar si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Convertimos ambas palabras a minúsculas para que la comparación no distinga entre mayúsculas y minúsculas
        val palabra1Ordenada = palabra1.lowercase().toCharArray().sorted()
        val palabra2Ordenada = palabra2.lowercase().toCharArray().sorted()

        // Comparamos las listas de caracteres ordenadas
        return palabra1Ordenada == palabra2Ordenada
    }
}