package org.example

fun main() {
    val expensesList = ExpensesList()
    expensesList.addExpenses(ExpensesItem(2, "Налоги", "04.09.2024"))
    expensesList.addExpenses(ExpensesItem(3607, "Продукты", "05.09.2024"))
    expensesList.addExpenses(ExpensesItem(100, "Продукты", "05.09.2024"))
    expensesList.addExpenses(ExpensesItem(1600, "Гигиена", "06.09.2024"))
    expensesList.addExpenses(ExpensesItem(1500, "Гигиена", "21.09.2024"))
    expensesList.addExpenses(ExpensesItem(3800, "Интернет", "30.09.2024"))
    expensesList.printExpenses()
    expensesList.printCalcExpenses()
}