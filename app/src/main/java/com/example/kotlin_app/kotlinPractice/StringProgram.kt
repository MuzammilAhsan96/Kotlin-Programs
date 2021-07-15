package com.example.kotlin_app.kotlinPractice

import java.util.*


fun main() {
    var ls1 = mutableListOf<Int>( 1 , 2 , 3 , 4 , 3);
    var sum= addList(ls1)
    println("Sum of Elements = $sum")

    var part= printPart(5)
    println("Partition number = $part")
    part= printPart(50)
    println("Partition number = $part")
    part= printPart(55)
    println("Partition number = $part")

    var names = mutableListOf<String>() //List Creation
    names.add("raj");   //Adding Elements
    names.add("ajay");
    names.add("alok");
    names.add("ashish");
    names.add("umesh");
    names.add("muzammil");
    names.add("ravi");
    names.add("prakhar");
    names.add("anmol");
    names.add("riya");
    names.add("aysha");
    names.add("satish");
    names.add("noor");
    names.add("farhan");
    names.add("muzakkir");
    names.add("zaid");
    names.add("subhan");
    names.add("adnan");
    names.add("nikhil");
    names.add("ashutosh");

    var s : String ="sh"

    var res : MutableList<String> = findNames(names,s)
    println(res)


    val names2: MutableList<String> = ArrayList()
    names2.add("muzammil")
    names2.add("muzakkir")
    names2.add("sachin")
    names2.add("raj")
    names2.add("koko")

    val ls2: List<String> = compareNames(names, names2)
    println(ls2)


}

fun compareNames(names1: List<String>, names2: List<String>): List<String> //Print the union of the lists
{
    val ls: MutableList<String> = ArrayList()
    var size1 = 0
    var size2 = 0
    if (names1.size > names2.size) {
        size1 = names1.size
        size2 = names2.size
    } else {
        size1 = names2.size
        size2 = names1.size
    }
    for (i in 0 until size1) {
        for (j in 0 until size2) {
            if (names1[i] == names2[j]) {
                ls.add(names1[i])
            }
        }
    }
    return ls
}

fun findNames(names : MutableList<String>,s : String):MutableList<String>
{
    val ls: MutableList<String> = ArrayList()
    //var ls = mutableListOf<String>()
    for(i in names.indices)
    {
        if(names.get(i).contains(s))
        {
            ls.add(names.get(i));
        }

    }
    return ls;
}

fun printPart(n :Int):Int
{
    if(n<1)
    {
        return 0;
    }
    var a :Int =n/10
    if(n%10==0)
    {
        a=a-1
    }
    return a+1
}

fun addList(ls : MutableList<Int>): Int
{
    var sum : Int =0
    for (i in 0..ls.size-1)
    {
        sum=sum+ls.get(i);
    }
    return sum
}

