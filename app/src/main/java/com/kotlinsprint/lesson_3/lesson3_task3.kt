package com.kotlinsprint.lesson_3

fun main() {
    val number = readln().toInt()

    for (i in 1..9) {
        val multipliedNumber = number * i
        println("$number x $i = $multipliedNumber")
    }
}