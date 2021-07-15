package com.example.kotlin_app

fun main() {
    var ls= mutableListOf<Int>(1,1,1,1,1,1,1,1,1,1)
    println(ls)
    for(i in ls.indices)
    {
        if(i==5)
        {
            ls.set(i,5)
        }
        else
        {
            ls.set(i,2)
        }
    }
    println(ls)
    swap(10,20)
}
fun swap(a:Int,b:Int)
{
    println("a = $a , b = $b")
    var c=a
    var d=b
    c=c*d
    d=c/d
    c=c/d
    println("a = $c , b = $d")
    c=a
    d=b
    c=c xor d
    d=c xor d
    c=c xor d
    println("a = $c , b = $d")



}