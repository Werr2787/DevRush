package com.example.kotlinbasics

fun main(){
    val circleRatio:Double=3.1415926535897932
    println(circleRatio)
    val circleRatio1:Float=3.1415926535897932F
    println(circleRatio1)
    val maTrue:Boolean=true
    val myFalse:Boolean=false
    println(maTrue||myFalse )
    println(maTrue&&myFalse )
    println(!myFalse )//fdzfxbd
    if(maTrue!=myFalse){
        println("sdf")
    }else{
        println("erag")
    }
    var name="Grigoriy"
    println("\n"+name+"\t"+name)
    println(name.uppercase())
    println(name.lowercase())
    println(""+" "+"\n")




    print("Input^_^:")
    var age = readln().toInt()
//    val entrValve= readln()
//    age=entrValve.toInt()
    if(age>=40){
        println("Go to the clab Barry")
    }
    else if (age>=18){
        println("AAAAAAAAAAAAAAAAAAAAAA")
    }
    else{
        println("GoodBuy")
    }


}