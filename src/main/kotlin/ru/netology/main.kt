package ru.netology

fun main() {
    val standartDiscount = 100.00
    val vipDiscount = 0.95
    val melomanDiscount = 0.99
    println("�� ��������� ���������� da/net")
    val meloman = readLine()
    println("������� ����� ���������� �������")
    val previousSale = readLine()!!.toDouble()
    println("������� ����� �������  �������")
    val currentSale = readLine()!!.toDouble()
    if (meloman=="da") {
        if (0 <= previousSale && previousSale <= 1000) {
            println("� ������ " + (currentSale * melomanDiscount))
        } else if (1001 <= previousSale && previousSale <= 10000) {
            println("� ������ " + ((currentSale - standartDiscount) * melomanDiscount))
        } else if (10001 <= previousSale) {
            println("� ������ " + ((currentSale * vipDiscount) * melomanDiscount))
        }
    } else if (0 <= previousSale && previousSale <= 1000) {
        println("� ������ " + currentSale)
    } else if (1001 <= previousSale && previousSale <= 10000) {
        println("� ������ " + (currentSale - standartDiscount))
    } else if (10001 <= previousSale) {
        println("� ������ " + (currentSale * vipDiscount))
    }
}

