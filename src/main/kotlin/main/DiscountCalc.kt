package main

fun main() {
    val standardDiscount = 100.00
    val extendedDiscount = 0.05
    val regularCustomerDiscount = 0.01

    val isRegularCustomer = true
    val previousPurchasesSum = 11000.00

    val purchaseSum = 100.00
    val purchasesDiscountSum = if (previousPurchasesSum >= 1001.00 && previousPurchasesSum <= 10000.00) {
        standardDiscount
    } else if (previousPurchasesSum >= 10001.00) {
        purchaseSum * extendedDiscount
    } else {
        0.00
    }
    val regularCustomerDiscountSum = if (isRegularCustomer) {
        (purchaseSum - purchasesDiscountSum) * regularCustomerDiscount
    } else {
        0.00
    }
    val totalPurchaseSum = purchaseSum - purchasesDiscountSum - regularCustomerDiscountSum

    println("""
        Your total sum: $totalPurchaseSum
        Discount: ${purchasesDiscountSum + regularCustomerDiscountSum}
    """.trimIndent())
}