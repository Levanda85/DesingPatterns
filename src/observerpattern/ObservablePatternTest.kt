package observerpattern

fun main() {
    val observableText = ObservableText(object : ValueChangeListener{
        override fun onValueChanged(newValue: String) {
            println("value is changed to: $newValue")
        }
    })
    observableText.text = "Hello"
    observableText.text = "There"
}