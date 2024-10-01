package org.example

class ExpensesItem(var sum: Int, var category: String, var date: String) {

    constructor(sum: Int, category: String, date: String, name: String): this(sum, category, date)

    fun printInfo() {
        println("Категория: ${category}, Дата: ${date}, Сумма расходов: ${sum}.")
    }
}