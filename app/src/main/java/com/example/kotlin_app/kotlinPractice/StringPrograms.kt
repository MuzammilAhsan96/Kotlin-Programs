package com.example.kotlin_app.kotlinPractice

fun main() {
    var count:IntArray=printDup("rajababajaka")
    for (i in 0..255)
    {
        if (count[i]>1)
        {
            println(Char(i)+" = "+count[i])
        }
    }
    var b:Boolean= anagrams("abcd","dabc")
    if(b==true)
    {
        println("Both Strings are Anagrams")
    }
    else
    {
        println("Not Anagrams")
    }

}
fun printDup(s:String):IntArray
{
    var count=IntArray(256)

    for (i in s.indices)
    {
        count[s[i].code]++
    }
    return count
}

fun anagrams(s1:String,s2:String):Boolean
{
    if(s1.length==s2.length) {
        var count1: IntArray = printDup(s1)
        var count2: IntArray = printDup(s2)
        var flag=0
        for (i in 0..255)
        {
            if(count1[i]!=count2[i])
            {
                flag=1
                break
            }
        }
        if(flag==0)
        {
            return true
        }
    }
    return false
}