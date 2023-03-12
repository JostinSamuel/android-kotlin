package com.app.learning.androidmaster

fun main(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    //println(readOnly.first())
    //println(readOnly.last())

    val example = readOnly.filter { day -> day.contains("a") }
    //println(example)

    //readOnly.forEach { weekday -> println(weekday) }

    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    weekDays.add(4,"UniqueDay")
    weekDays.forEach{w -> println(w)}
}