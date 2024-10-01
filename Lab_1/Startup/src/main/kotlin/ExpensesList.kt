package org.example

class ExpensesList() {
    private var itemsArray: Array<ExpensesItem> = emptyArray()

    private fun calcExpenses(): Map<String, Int> {
        val totalExpenses = mutableMapOf<String, Int>()
        for (expenses in itemsArray) {
            val sum = totalExpenses.getOrDefault(expenses.category, 0)
            totalExpenses[expenses.category] = sum + expenses.sum
        }
        return totalExpenses
    }

    fun printCalcExpenses() {
        val totalExpenses = calcExpenses()
        if (totalExpenses.isNotEmpty()) {
            for ((category, sum) in totalExpenses) {
                println("Категория: ${category}, Сумма всех расходов: ${sum}.")
            }
        } else {
            println("Списка расходов не существует...")
        }
    }

    fun printExpenses() {
        if (itemsArray.isNotEmpty()) itemsArray.forEach{item -> item.printInfo()}
        else println("Список расходов пуст...")
    }

    fun addExpenses(item: ExpensesItem) {
        itemsArray += item
    }
}