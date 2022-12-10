package `02-ciclos-y-arreglos`


fun main() {

    /* una linea de codigo podemos omitir {} */

    if (1 > 2)
        print("hola")
    else
        print("chau")

    // WHEN (especie de switch o if else)

    /*
    * when (valor){
    *   1 -> print()
    *   2 -> print()
    *   else -> {
    *
    *   }
    * }
    * */

    println("escriba un numero")
    val valor = readLine()!!.toInt()

    when (valor){
        1 -> {
            println("valor es 1")
        }
        2 -> println("valor es 2")
        else -> {
            println("es otro numero")
        }
    }

    val combustible = "gasolina"

    when (combustible) {
        "gasolina", "diesel" -> println("itiliza gasolina o diesel")
        else -> println("utiliza otro")
    }

    val edad = readLine()!!.toInt()

    when
    {
        edad > 23 -> println("2")
        edad <= 23 -> println("1")
    }

    // IN -> ver si un valor esta dentro de cierto rango

    val mensajeResultado = when (edad)
    {
        in 1..17 -> {
            "es menor"
            "no puede beber"
        }
        in 18..65 -> "adulto"
        else -> "edad incorrecta"
    }

    val value: Any = "hola" // puede contener valores de todo tipo.
    when (value) {
        is String -> println("es un string")
        is Int -> println("es Int")
        else -> println("ni stirng ni int")
    }


}



