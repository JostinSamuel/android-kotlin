package com.app.learning.androidmaster

fun main() {
    var name:String? = null
    //println(name!!.get(3)) --> !! estoy seguro que no da error y no es null
    println(name?.get(3) ?: "Es nulo")
}