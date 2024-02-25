package com.example.kotlinbasics

class BookClass() {
}
class Book(var title:String, var author:String,var yearPublished:Int){
    init {
        customBook(title)
    }
    fun customBook(name: String){
        println("$name A")
    }
}