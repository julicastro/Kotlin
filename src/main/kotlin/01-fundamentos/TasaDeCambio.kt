package tasadecambio

import java.text.DecimalFormat


    var tasaCambio = 0.0;
    var pesosEnCaja = 0.0;
    var dolaresEnCaja = 0.0;

fun main() {

    print("Ingresa la tasa de cambio de dolar a peso: $")
    tasaCambio = readLine()!!.toDouble()

    print("Ingresa la cantidad de pesos para apertura de caja: $")
    tasaCambio = readLine()!!.toDouble()

    print("Ingresa la cantidad de dolares para apertura de caja: $")
    tasaCambio = readLine()!!.toDouble()

    controlDeOperaciones()

}

fun controlDeOperaciones(){
    print("\nIngresa la cantidad de dolares a cambiar: $")
    val dolaresACambiar = readLine()!!.toDouble()

    dolaresEnCaja += dolaresACambiar

    val pesosAEntregar = tasaCambio * dolaresACambiar

    pesosEnCaja -= pesosAEntregar

    val formato = "#,###.00"

    println("""  
            ** Recibo **
            Pesos argentinos a entradar: $${DecimalFormat(formato).format(pesosAEntregar)}
            
            Pesos en caja: $${DecimalFormat(formato).format(pesosEnCaja)}
            
            Dolares en caja: U$${DecimalFormat(formato).format(dolaresEnCaja)}
        """.trimIndent())

    controlDeOperaciones()

    // recursividad -> una funcion q se llama a si misma
}