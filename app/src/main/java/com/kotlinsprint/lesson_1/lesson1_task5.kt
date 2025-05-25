package com.kotlinsprint.lesson_1

import android.annotation.SuppressLint

const val MIN = 60
const val HOUR = 3600

@SuppressLint("DefaultLocale")
fun main() {
    val inputSeconds = 6480

    val hours = inputSeconds / HOUR
    val minutes = inputSeconds / MIN % MIN
    val seconds = inputSeconds % MIN

    val result = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(result)
}
