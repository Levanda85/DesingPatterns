package singletonpattern

class Singleton private constructor() {

    companion object {

        @Volatile
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if (instance == null) {
                instance = Singleton()
            }
            return instance!!
        }
    }
}