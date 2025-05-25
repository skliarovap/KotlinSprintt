package com.kotlinsprint.lesson_3

fun main() {
    val inputMain = "D2-D4;0"

    val whereIsTheMoveFrom = inputMain.substringBefore("-")
    val whereToGo = inputMain.substringAfter("-").substringBefore(";")
    val numberOfMove = inputMain.substringAfter(";")

    println(whereIsTheMoveFrom)
    println(whereToGo)
    println(numberOfMove)
}