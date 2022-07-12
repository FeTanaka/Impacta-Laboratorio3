package br.com.impacta.laboratorio3

fun main() {
    var idade = 33
    var desconto = if (idade >= 50) 30 else if (idade >= 25 && idade < 50) 15 else if (idade < 25) 15 else 0
    println ("O valor do desconto é $desconto%")
}