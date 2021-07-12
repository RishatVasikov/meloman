package ru.netology

fun main() {
    val standartDiscount = 100.00
    val vipDiscount = 0.95
    val melomanDiscount = 0.99
    println("Вы покупаете ежемесячно da/net")
    val meloman = readLine()
    println("Введите сумму предыдущей покупки")
    val previousSale = readLine()!!.toDouble()
    println("Введите сумму текущей  покупки")
    val currentSale = readLine()!!.toDouble()
    if (meloman=="da") {
        if (0 <= previousSale && previousSale <= 1000) {
            println("К оплате " + (currentSale * melomanDiscount))
        } else if (1001 <= previousSale && previousSale <= 10000) {
            println("К оплате " + ((currentSale - standartDiscount) * melomanDiscount))
        } else if (10001 <= previousSale) {
            println("К оплате " + ((currentSale * vipDiscount) * melomanDiscount))
        }
    } else if (0 <= previousSale && previousSale <= 1000) {
        println("К оплате " + currentSale)
    } else if (1001 <= previousSale && previousSale <= 10000) {
        println("К оплате " + (currentSale - standartDiscount))
    } else if (10001 <= previousSale) {
        println("К оплате " + (currentSale * vipDiscount))
    }
}

