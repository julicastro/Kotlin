package ejercicios

var calle = "";
var ciudad = "";
var provincia = "";
var pais = "";
var codigoPostal = "";


fun main() {

    print("Escriba su calle: ")
    calle = readLine()!!.toString()

    print("Escriba su ciudad: ")
    ciudad = readLine()!!.toString()

    print("Escriba su provincia: ")
    provincia = readLine()!!.toString()

    print("Escriba su pais: ")
    pais = readLine()!!.toString()

    print("Escriba su codigoPostal: ")
    codigoPostal = readLine()!!.toString()

    print("Direccion completa: ${calle}, ${ciudad}, ${provincia}, ${pais}, ${codigoPostal}")


}