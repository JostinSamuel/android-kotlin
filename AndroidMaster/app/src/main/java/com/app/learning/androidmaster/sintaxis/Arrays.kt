package com.app.learning.androidmaster

fun main () {
    var weekDays = arrayOf("L","M","M","J","V","S","D")

    /*for (w in weekDays){
        print(w + ",")
    }*/

    /*for (position in weekDays.indices) { //posicion
        println(weekDays[position])
    }*/

    //posicion y valor
    for ((position,value) in weekDays.withIndex()) {
        println("Posición ${position}, contiene valor ${value}")
    }

    //println("\nSize: " + weekDays.size)
}