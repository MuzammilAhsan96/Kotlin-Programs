package com.example.kotlin_app

import kotlin.reflect.typeOf

fun main() {
    var ar= arrayOf(1,3,"Raj");
    var ar1= intArrayOf(1,23,35,50,7)
    var myArray = Array<Int>(5){0}

    for(element in myArray) {
        println(element)
    }

    println()
}