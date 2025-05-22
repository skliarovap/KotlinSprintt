package com.kotlinsprint.lesson_2

data class CompanyEmployee(val type: String, val count: Int, val salary: Int)

fun main() {
    val companyEmployees = listOf(
        CompanyEmployee("работник", 50, 30000),
        CompanyEmployee("стажер", 30, 20000),
    )

    val permanentEmployees = companyEmployees.find { it.type == "работник" }
    val salaryForPermanentEmployees = permanentEmployees!!.salary * permanentEmployees.count

    val generalExpenses = companyEmployees.sumOf { it.salary * it.count }
    val averageSalary = generalExpenses / companyEmployees.sumOf { it.count }

    println(salaryForPermanentEmployees)
    println(generalExpenses)
    println(averageSalary)
}

/*
В компании работало 50 человек с зарплатой по 30000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.
 */