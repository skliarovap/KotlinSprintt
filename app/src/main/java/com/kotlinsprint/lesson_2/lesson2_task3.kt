package com.kotlinsprint.lesson_2

const val TRAINDEPARTURETIMEHOUR = 9
const val TRAINDEPARTURETIMEMIN = 39
const val TRAINWAIST = 457

fun main(){
    var resultMinutes = TRAINDEPARTURETIMEMIN
    var resultHours = TRAINDEPARTURETIMEHOUR

    for (i in 1..TRAINWAIST){
        if (resultMinutes != 59){
            resultMinutes++
        }
        else{
            resultHours++
            resultMinutes = 0
        }
    }

    println("$resultHours:$resultMinutes")
}

/*
Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */