package observerpattern

class PrintingTextChangedListener : ValueChangeListener {
    override fun onValueChanged(newValue: String) {
        println("Text is changed to: $newValue")
    }
}
