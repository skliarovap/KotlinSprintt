package com.kotlinsprint.lesson_3

fun main() {
    var whereIsTheMoveFrom = "E2"
    var whereToGo = "E4"
    var numberOfMove = 1
    var result = "$whereIsTheMoveFrom, $whereToGo, $numberOfMove"
    println(result)

    whereIsTheMoveFrom = "D2"
    whereToGo = "D3"
    numberOfMove++
    result = "$whereIsTheMoveFrom, $whereToGo, $numberOfMove"
    println(result)
}