package com.example.kotlin_app.kotlinPractice

fun main() {
    var arr=arrayOf(11, 22, 33, 44, 55,52,43)
    var l= secondLargest(arr)
    println(l)

}
fun largest(arr: Array<Int>):Int
{
    var a:Int= Int.MIN_VALUE
    for (i in arr.indices)
    {
        if (a<arr[i])
        {
            a=arr[i]
        }
    }
    return a
}
fun secondLargest(arr: Array<Int>):Int
{
    var l= largest(arr)
    var a:Int= Int.MIN_VALUE
    for (i in arr.indices)
    {
        if (a<arr[i]&&l>a&&arr[i]<l)
        {
            a=arr[i]
        }
    }
    return a
}