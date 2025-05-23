package com.kotlinsprint.lesson_2

import android.annotation.SuppressLint

const val HOUR = 60

@SuppressLint("DefaultLocale")
fun main() {
    val hours = 9
    val minutes = 39
    val trainWaist = 457

    val departureTime = hours * HOUR + minutes + trainWaist
    val trainWaistHour = departureTime / HOUR
    val trainWaistMin = departureTime % HOUR
    val result = String.format("%02d:%02d", trainWaistHour, trainWaistMin)

    println(result)
}

/*
Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */