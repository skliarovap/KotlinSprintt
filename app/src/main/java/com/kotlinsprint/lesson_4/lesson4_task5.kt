package com.kotlinsprint.lesson_4

fun main() {
    val shipIsNotDamage = true
    val crew = 55..70
    val boxesOfProvisions = 50


    val inputShipIsNotDamage = readln().toBoolean()
    val inputCrew = readln().toInt()
    val inputBoxesOfProvisions = readln().toInt()
    val inputIsWeatherFavorable = readln().toBoolean()

    val result = inputShipIsNotDamage == shipIsNotDamage &&  inputCrew in crew && inputBoxesOfProvisions > boxesOfProvisions || inputShipIsNotDamage != shipIsNotDamage && inputCrew == 70 && inputBoxesOfProvisions >= boxesOfProvisions && inputIsWeatherFavorable

    println(result)

}