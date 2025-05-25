package com.kotlinsprint.lesson_4

fun main() {
    val countOfTheDay = readln().toInt()

    val isTheHandTrainingDay = countOfTheDay % 2 != 0

    println(
        """Упражнения для рук:       $isTheHandTrainingDay
Упражнения для ног:       ${!isTheHandTrainingDay}
Упражнения для спины:  ${!isTheHandTrainingDay}
Упражнения для пресса: $isTheHandTrainingDay"""
    )
}