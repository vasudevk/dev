package io.dev

fun multiply(x: String, y: String) = x.length * y.length

fun main() {

    var fname: String = "Vasu"
    val lname: String = "Dev"
    println("Name is $fname, $fname$lname")

    val multiply = multiply(fname, lname).toDouble()
    println(multiply)
}