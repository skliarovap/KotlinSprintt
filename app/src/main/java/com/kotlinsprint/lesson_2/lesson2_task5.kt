package com.kotlinsprint.lesson_2

import kotlin.math.pow

const val SUMM = 70000
const val INTERESTRATE = 16.7
const val DEPOSITAMOUNTAFTERYEARS = 20

fun main() {
    val interestRateInDecimalForm = INTERESTRATE / 100

    val sum = SUMM * (1 + interestRateInDecimalForm / 1).pow(DEPOSITAMOUNTAFTERYEARS * 1)
    val result = "%.3f".format(sum)

    println(result)
}

/*
Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
Используя формулу сложных процентов (ее можно загуглить), нужно посчитать размер вклада через 20 лет с такими условиями:

 – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и проинициализировать переменную);
 – Процентная ставка 16,7% (проценты начисляются в конце года);
 – Подсчитать размер вклада через 20 лет;

 – Результат должен быть дробным числом с 3 знаками после разделителя;
 – Ответ должен получиться таким 1536438.428.
 */