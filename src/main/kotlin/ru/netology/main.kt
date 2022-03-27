package ru.netology

fun main() {

    val previousPurchases = 14_002
    val purchase = 3_735
    val numberOfPurchases = 5

    val startDiscount = 1_001
    val startPercentageDiscount = 10_001

    val standardDiscount = purchase - 100
    val percentDiscount = purchase - ((purchase * 5) / 100)

    val regularCustomer = numberOfPurchases >= 3

    if ((previousPurchases >= startDiscount) && (previousPurchases < startPercentageDiscount) &&
        (regularCustomer)) {
        println("Покупка - $purchase руб.")
        println("После применения скидки 100 рублей - $standardDiscount руб.")
        println("После применения 1% скидки - ${standardDiscount.toDouble() - (standardDiscount.toDouble() / 100)} " +
                "руб.")
    } else if ((previousPurchases >= startPercentageDiscount) && (regularCustomer)) {
        println("Покупка - $purchase руб.")
        println("После применения 5% скидки - $percentDiscount руб.")
        println("После применения 1% скидки - ${percentDiscount.toDouble() - (percentDiscount.toDouble() / 100)} " +
                "руб.")
    } else if ((previousPurchases >= startDiscount) && (previousPurchases < startPercentageDiscount)) {
        println("Покупка - $purchase руб.")
        println("После применения скидки 100 рублей - $standardDiscount руб.")
    } else if (previousPurchases >= startPercentageDiscount) {
        println("Покупка - $purchase руб.")
        println("После применения 5% скидки - $percentDiscount руб.")
    } else println("Покупка - $purchase руб.")


}