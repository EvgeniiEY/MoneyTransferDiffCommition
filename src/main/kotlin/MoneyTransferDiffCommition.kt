package ru.netology

val cardType: String = "VK Pay"
//val amount: Int = 0
//val commision: Double = 0.0
//val pastTransfersSum: Int = 0

fun main() {
    println(commisionCalculate("Visa", 0, 1000))
}

fun commisionCalculate(cardType: String, pastTransfersSum: Int, amount: Int) =
    when (cardType) {
        "MasterCard", "Maestro" -> maestroMasterCardsCommission(amount, pastTransfersSum)
        "Visa", "Мир" -> visaMirCommision(amount)
        "VK Pay" -> 0
        else -> 0
    }

fun maestroMasterCardsCommission(amount: Int, pastTransfersSum: Int) =
    if (amount > 0 && amount + pastTransfersSum <= 75_000) {
        0
    } else {
        (amount * 0.6 / 100 + 20) * 100
    }

fun visaMirCommision(amount: Int) =
    if (amount * 0.75 / 100 >= 35) {
        amount * 0.75 / 100 * 100
    } else {
        35 * 100
    }
