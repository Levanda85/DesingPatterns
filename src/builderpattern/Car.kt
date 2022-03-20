package builderpattern

class Car constructor(builder: CarBuilder) {
    private val age: Int
    private val airConditioner: Boolean
    private val screen: Boolean
    private val abs: Boolean

    init {
        age = builder.age
        airConditioner = builder.airConditioner
        screen = builder.screen
        abs = builder.abs
    }
}
