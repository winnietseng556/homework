package com.train

import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var tickets = scanner.nextInt()
    println("How many round-trip tickets:")
    var returns = scanner.nextInt()
    var ticket = Ticket(tickets, returns)
    ticket.printReceipt()
}

class Ticket(var tickets: Int, var returns: Int) {
    var price = 1000
    var discount = 0.9

    fun printReceipt() {
        if (ticketsCheck()) {
            println("Total tickets: $tickets")
            println("Round-trip: $returns")
            println("Total: ${getTotal()}")
        } else {
            println("數量錯誤，請重新輸入")
        }
    }

    fun getTotal(): Int {
        var single = if (ticketsCheck()) tickets - returns else 0
        if (ticketsCheck())
            return ((price * single) + (price * 2 * returns * discount)).toInt()
        return 0
    }

    fun ticketsCheck(): Boolean {
        return tickets - returns >= 0
    }
}