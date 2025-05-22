package com.kotlinsprint.lesson_1

const val INPUTSECONDS = 6480

fun main() {
    val hours = INPUTSECONDS / 3600
    val minutes = INPUTSECONDS / 60 % 60
    val seconds = INPUTSECONDS % 60

    val result = "0$hours:$minutes:0$seconds"
    println(result)
}
