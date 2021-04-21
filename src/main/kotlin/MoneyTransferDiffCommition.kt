package ru.netology

val cardType: String = "VK Pay"
val amount: Int = 0
val commision: Double = 0.0
val pastTransfersSum: Int = 0

fun main() {

    println(commisionCalculate("Visa", 0, 10000))

}

fun commisionCalculate(cardType: String, pastTransfersSum: Int, amount: Int) =
    when (cardType) {
        "MasterCard" -> {
            if (amount > 0 && amount + pastTransfersSum <= 75_000) {
                0
            } else {
                (amount * 0.6 / 100 + 20) * 100
            }
        }
        "Maestro" -> {
            if (amount > 0 && amount + pastTransfersSum <= 75_000) {
                0
            } else {
                (amount * 0.6 / 100 + 20) * 100
            }
        }
        "Visa" -> {
            if (amount * 0.75 / 100 >= 35) {
                amount * 0.75 / 100 * 100
            } else {
                35 * 100
            }
        }
        "Мир" -> {
            if (amount * 0.75 / 100 >= 35) {
                amount * 0.75 / 100 * 100
            } else {
                35 * 100
            }
        }
        "VK Pay" -> 0
        else -> 0
    }