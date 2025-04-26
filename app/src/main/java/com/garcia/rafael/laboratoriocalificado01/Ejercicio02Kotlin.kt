package com.garcia.rafael.laboratoriocalificado01

class Ejercicio02Kotlin {

    // Función para contar cuántas vocales hay en una cadena de texto
    fun contarVocales(texto: String): Int {
        // Convertimos el texto a minúsculas para facilitar la comparación
        val textoMinusculas = texto.lowercase()

        // Inicializamos el contador de vocales en 0
        var contador = 0

        // Recorremos cada caracter de la cadena
        for (caracter in textoMinusculas) {
            // Verificamos si el caracter actual es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                // Si es una vocal, incrementamos el contador
                contador++
            }
        }

        // Retornamos el número total de vocales encontradas
        return contador
    }
}
