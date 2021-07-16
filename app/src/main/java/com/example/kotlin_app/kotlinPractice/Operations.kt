package com.example.kotlin_app.kotlinPractice

import java.io.IOException
import java.lang.ArithmeticException
import java.lang.Exception
import java.util.*

fun main(args:Array<String>) {
    val sc = Scanner(System.`in`)
    var q=0
    do {


        try {
            var n1: Int = 0
            var n2: Int = 0
            var c: Char = '+'
            println("Enter two numbers")
            try {


                n1 = sc.nextLine().trim().toInt()
                n2 = sc.nextLine().trim().toInt()
            } catch (ex: IOException) {
                println(ex.message + "\nPlease Enter Integer value")
            }
            try {

                println("Enter \n+ for addition\n- for substraction\n/ for division\n* for multiplication")
                c = sc.nextLine()!![0]

            } catch (ef: IOException) {
                println(ef.message + "\nPlease Enter Character value")
            }
            val d: Number = operation(n1, n2, c)
            if (d == -1) {
                q=0
                println("Can not divide by zero")
            } else if (d == 0) {
                q=0
                println("Operation not performed")
            } else {
                q=1
                println("Answer = $d")
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }while (q==0)
}

fun operation(a: Int, b: Int, opt: Char): Number {
    when(opt)
    {
        '+'->return a+b
        '-'->return a-b
        '*'->return a*b
        '/'->{
            try {
                var d:Double=(a/b).toDouble()
                return d
            }catch (e:ArithmeticException)
            {
                return -1
            }
        }
    }
    return 0
}