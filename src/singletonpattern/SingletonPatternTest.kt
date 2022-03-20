package singletonpattern

fun main() {
    val a = Singleton.getInstance()
    val b = Singleton.getInstance()
    println(a === b)
}