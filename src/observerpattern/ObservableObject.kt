package observerpattern

import kotlin.properties.Delegates

class ObservableObject(listener: ValueChangeListener) {
    var text: String by Delegates.observable(
        initialValue = "",
        onChange = { property, oldValue, newValue ->
            listener.onValueChanged(newValue)
        }
    )
}