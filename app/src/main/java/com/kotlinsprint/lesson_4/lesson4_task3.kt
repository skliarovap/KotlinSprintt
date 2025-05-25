package com.kotlinsprint.lesson_4

fun main() {
    val isSunny = true
    val isOpenAwning = true
    val humidity = 20
    val season = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isOpenAwning && humidity == 20 && season != "Зима"}")
}