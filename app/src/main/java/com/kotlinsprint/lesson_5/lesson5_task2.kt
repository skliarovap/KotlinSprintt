package com.kotlinsprint.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val inputYear = readln().toInt()
    val currentYear = 2025

    val age = currentYear - inputYear

    if (age >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}