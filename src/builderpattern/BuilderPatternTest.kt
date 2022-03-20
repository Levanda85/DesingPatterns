package builderpattern

fun main() {
    var car = CarBuilder(1)
        .screen(true)
        .airConditioner(true)
        .abs(true)
        .build()
    println(car)
}