package com.example.kotlinsyntax

import kotlin.random.Random

fun main() {
    
}

fun iterationStatements(){
    var startingNumber = 0
    while (startingNumber <= 10){
        println("StartingNumber = $startingNumber")
        startingNumber++
    }

    for (number in 10 downTo 1){
        println("Number = $number")
    }

    val names = listOf("Ann", "David", "Zak")
    for (name in names){
        println("Name = $name")
    }
}

fun conditionalStatements(){
    val randomNumber = Random.nextInt(10)
    println("RandomNumber = $randomNumber")

    if (randomNumber < 5){
        println("Number too Low")
    } else if (randomNumber == 5){
        println("Just Perfect!")
    } else if (randomNumber > 5){
        println("Number too High")
    }
}

fun relationalOperators(){
    val x = 20
    val y = 22

    if (x >= y) { // if (x > y || x==y)

    }else{

    }

    if (x <= y) { // if (x < y || x==y)

    }else{

    }

}

fun logicalOperators() {
    val a = 10
    val b = 15

    if (a > 9 && b < 14) {
        println("Both condition is true. Logical AND")
    } else {
        println("Only one condition is true. Logical AND")
    }


    val c = 20
    val d = 41

    if (c > 9 || d < 14) {
        println("One condition is true. Logical OR")
    } else {
        println("Both condition is false. Logical OR")
    }

    var isChickenTasty = true


    if (!isChickenTasty) { // if (isChickenTasty == false)
        println("Chicken is not Tasty")
    } else {
        println("Chicken is Tasty")
    }
}

fun assignmentOperators() {
    val name = "Olorunleke Opeyemi"

    var number = 15
    number += 3 //number = number +3

    var index = 22
    index -= 7 //index = index - 7
    println(index)
}

fun ArithmeticOperators() {
    var x = 10
    var y = 3

    x = x + 1 // x++
    y = y - 1// y--

    println(x)
    println(y)
}

fun dataTypes() {
    val height = 1.81f // Floating Point Number
    val fullName = "Opeyemi Olorunleke" // String
    val initials = 'O' // Character
    var isKotlinFun = true // Boolean
}

fun variableAndValues() {
    var age = 16
    age = 17
    println("My age is = $age")

    val yearOfBirth = 1994
    println("My YearOfBirth = $yearOfBirth")
}
