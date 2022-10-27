package fundamentos

fun main (){

    println("ingrese dato")
    var dato = readLine()

    if(dato == "" || dato == null){
        println("error al cargar dato")
    }else{
        println("Dato cargado correctamente")
        println("el dato es: \n $dato")
        println("en mayuscula: " + dato.uppercase())

        println("""
        *** Datos ***
        Nombre: $dato
        Apelldo: $dato
    """.trimIndent())
    }





}