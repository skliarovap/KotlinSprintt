package com.kotlinsprint.lesson_4

const val COUNTOFTABLES = 13

fun main() {
    val tablesBookedForToday = 13
    val tablesBookedForTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesBookedForToday < COUNTOFTABLES},\nДоступность столиков на завтра: ${tablesBookedForTomorrow < COUNTOFTABLES}.")
}