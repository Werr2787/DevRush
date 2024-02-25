package com.example.kotlinbasics

class Dog(val name:String, val breed:String, var age: Int=0) {



    init {
        dark(name)
    }
    fun dark(name: String){
        println("$name Woof Woof")
    }

}