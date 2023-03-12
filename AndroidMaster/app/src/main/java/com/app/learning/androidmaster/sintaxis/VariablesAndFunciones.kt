package com.app.learning.androidmaster

fun main(){
    println("hola!")

    //val es una constante -> no se puede reasignar su valor
    //var es vaariable

    val number:Int = 20
    var name:String = "Jostin"
    var nombreCompleto = "$name Samuel"

    println(nombreCompleto)

    showResult()
}

//puedo asignarle el valor por defecto para evitar mandarlo al momento de llamar a la función
fun returnProduct(number1:Int = 30, number2:Int =15): Int {
    return number1*number2
}

fun showResult() {
    println("Operation result is ${returnProduct()}") //returnProduct(20,10) no da error ya que tiene parámetros por default
}