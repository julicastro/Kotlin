package fundamentos

import java.util.*

fun main() {
    mostrarMensaje(4)
    mostrarFecha ()
}

// SHIFT + SHIFT BUSCA EN TODO EL PROYECTO
// CTRL F BUSCA EN EL ARCHIVO
// CTRL R ES COMO EL CTRL H DEL VISUAL STUDIO

fun mostrarMensaje(codigo: Int) {
    when (codigo) {
        1 -> {
            println("El codigo es 1")
        }
        2 -> {
            println("el codigo es 2")
        }
        else -> {
            println("el codigo no es ni 1 ni 2")
        }
    }
}

fun mostrarFecha (){

    println("""
        Mensaje: Hola desde Kotlin
        Fecha: ${Date()}
    """.trimIndent())

}


