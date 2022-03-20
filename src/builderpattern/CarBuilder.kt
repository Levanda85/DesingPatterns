package builderpattern

class CarBuilder(val age: Int) {
    var airConditioner = false
    var screen = false
    var abs = false

    fun airConditioner(boolean: Boolean): CarBuilder {
        airConditioner = boolean
        return this
    }

    fun screen(boolean: Boolean): CarBuilder {
        screen = boolean
        return this
    }

    fun abs(boolean: Boolean): CarBuilder {
        abs = boolean
        return this
    }

    fun build(): Car {
        return Car(this)
    }
}