package org.example.game

fun main() {
    val choices = arrayOf("Paper", "Rocket", "Scissors")

    while(true) {
        println("Please enter: 0-Paper/1-Rocket/2-Scissors")
        val user = readln().toInt()
        val computer = (Math.random() * choices.size).toInt()

        println("User: ${choices[user]}")
        println("Computer: ${choices[computer]}")

        val diff = ((computer - user) + 3) % 3
        when(diff){
            0 -> println("EQUAL")
            1 -> println("LOSE")
            2 -> {
                println("WIN")
                break
            }
        }
    }
}


