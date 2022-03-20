package observerpattern

class ObservableText(private val onTextChanged: ValueChangeListener) {
    var text: String = ""
        get() = text
        set(value) {
            field = value
            onTextChanged.onValueChanged(value)
        }
}