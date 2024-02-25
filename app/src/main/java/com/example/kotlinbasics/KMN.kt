package com.example.kotlinbasics

fun main(){
    while (true) {
        print("Input^_^:")
        var player = readln().lowercase()
        var bot = ""
        val random = (1..3).random()
        when (random) {
            1 -> {
                bot = "Rock"
            }

            2 -> {
                bot = "Paper"
            }

            3 -> {
                bot = "Scissors"
            }
        }


        var winner = when {
            player == bot -> "Tie"
            player === "rock" && bot == "Scissors" -> "Player"
            player == "paper" && bot == "Rock" -> "Player"
            player == "scissors" && bot == "Paper" -> "Player"
            player=="stop"->"Stop"
            else -> "Bot"
        }
        if (winner == "Tie") {
            println(bot)
            println("Ничья")
        }
        else if (winner=="Stop"){
            println("Goodbay")
            break
        }
        else {
            println(bot)
            println("$winner won!")
        }
    }
}