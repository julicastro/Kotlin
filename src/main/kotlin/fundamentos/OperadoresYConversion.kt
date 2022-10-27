package fundamentos

import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main (){

    var valor = readLine()!!.toInt() // indica q solo va a ser un numero
    var result = valor * 5.84234;

    println("valor sin redondear")
    println(result)
    println("redondeado con int")
    println(round(result).toInt())
    println("redondeado para abajo")
    println(floor(result))
    println("redondeado para arriba")
    println(ceil(result).toInt())
    println("muestra 2 decimales")
    println(DecimalFormat("#.##").format(result)) /* Parte entera . Parte decimal*/

}