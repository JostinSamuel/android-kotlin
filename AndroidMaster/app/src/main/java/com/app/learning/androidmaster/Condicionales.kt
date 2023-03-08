package com.app.learning.androidmaster

fun main(){
    basicIf()
    getMonth(8)
    result(true)
}

fun basicIf() {
    val name = "Samuel"

    if (name == "SAMUEL") {
        println("ok,son iguales")
    } else {
        println("Equivocado")
    }
}

fun getMonth(month:Int) {
    when (month){
        0,1,10 -> println("Enero")
        in 2..8 -> println("Febrero..Agosto")
        3 -> print("Marzo")
        4 -> {
            println(" es-ES Abril ")
            println(" en-EN April ")
        }
        else -> println("Error")
    }
}

fun result(value: Any) {
    when (value) {
        is Int -> value+value
        is String -> println(value)
        is Boolean -> if (value) println("true is boolean") else println("es false")
    }
}