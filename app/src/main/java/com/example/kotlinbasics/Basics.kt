package com.example.kotlinbasics

import java.time.temporal.TemporalAmount

//fun main(){
//    println("Hello World!")
//    val constantNumber:Double=1E100
//    var mutableString:String="FSA";
//    println("$constantNumber $mutableString")
//    mutableString="aer"
//    println(mutableString )
//    var count =0
//    while (count<3){
//        println("Count is $count")
//        count++
//    }
//    println("Loop is done!")
//}

data class CoffeeDetails(val saxar: Int,
                         val name:String,
                         val size:String,
                         val creamAmount: Int)

fun main() {
    val shoppingList=mutableListOf("Processor","RAM","Graphics Card RTX 3060","SSD")
    println(shoppingList)
    shoppingList.add("Cooling System")
    println(shoppingList)
    shoppingList.remove("Graphics Card RTX 3060")
    println(shoppingList)
    shoppingList.add("Graphics Card RTX 4090")
    println(shoppingList)

    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2,"RAM")
    println(shoppingList[2])
    shoppingList[3]="dasf"
    println(shoppingList)
    shoppingList.set(1,"Water Colling")
    println(shoppingList)
    shoppingList.add(2,"fv")
    println(shoppingList)

    val hasRam=shoppingList.contains("RAM")
    if (hasRam){
        println("Has Ram in the list")
    }else{
        println("No Ram in the list")
    }
    println(shoppingList.size)

    for(index in 0 until 4){

    }
    for(index in 0 until shoppingList.size){
        println("item ${shoppingList[index]} is at index $index")

    }
    println(shoppingList)

//    val coffeeDetails=CoffeeDetails(0,"denis","xxl",0)
//    Coffe(coffeeDetails)
}


//var daisy = Dog("Daisy", "Bafd", 4)
////
//    println("${daisy.name} is a=${daisy.breed} and is ${daisy.age} yers old")
//    println("A year has passed!")
//
//    daisy.age = 2
//    println("${daisy.name} is a=${daisy.breed} and is ${daisy.age} yers old")
//    print("What your name ")
//    val name= readln()
//    print("How much sugar ")
//    val saxar= readLine()
//    try {
//        val sax=saxar?.toInt()
//        if (sax != null) {
//            Coffe(name,sax)
//        }
//    }catch (e:NumberFormatException){
//        println("Input Integer")
//    }
//    var myaDD=add(1,3)
//    print(myaDD)
//}

//fun add(n1:Int,n2:Int):Int{
//    val res=n1+n2
//    return res
//}
//
//fun makeCoffe(){
//    while (true) {
//        println("Input")
//        val an = readLine();
//        try {
//            val intValue = an?.toInt()
//            if (intValue != null && intValue>0) {
//                println("Кофе с количеством ложек сахара в размере $intValue")
//            } else {
//                println("Введено некорректное значение")
//            }
//        } catch (e: NumberFormatException) {
//            println("Input integer")
//        }
//        catch (e: Exception) {
//            println("ERROR")
//        }
//
//
//    }



fun Coffe(coffeeDetails: CoffeeDetails){
    if (coffeeDetails.saxar>1){
        println("Coffee with ${coffeeDetails.saxar} spoons of sugar for ${coffeeDetails.name}")
    }
    else if (coffeeDetails.saxar ==0){
        println("Coffee with no sugar for ${coffeeDetails.name}")
    }
    else if (coffeeDetails.saxar ==1){
        println("Coffee with sugar for ${coffeeDetails.name}")
    }
    else{
        println("What are you doing")
    }
}