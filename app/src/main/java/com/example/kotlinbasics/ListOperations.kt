package com.example.kotlinbasics

fun main(){
    val fruitsList= mutableListOf("fB","EBF","ebf")
    fruitsList.add("asdf")
    fruitsList.remove("fB")
    println(fruitsList)
    if(fruitsList.contains("EBF")){
        println("Yes")
    }
    else{
        println("Not frukt")
    }
    for(item in fruitsList){
        println(item)
        if (item=="ebf"){
            fruitsList.removeLast()
            break
        }
    }
    println(fruitsList)


}

