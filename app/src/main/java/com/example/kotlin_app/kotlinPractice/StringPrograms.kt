package com.example.kotlin_app.kotlinPractice

fun main() {
    printDup("rajababajaka")

}
fun printDup(s:String)
{
    var count=IntArray(256)

    for (i in s.indices)
    {
        count[s[i].code]++
    }
    for (i in 0..255)
    {
        if (count[i]>1)
        {
            println(Char(i)+" = "+count[i])
        }
    }
}