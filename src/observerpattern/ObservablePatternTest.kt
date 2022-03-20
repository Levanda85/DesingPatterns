package observerpattern

fun main(){
    val observableObject=ObservableObject(PrintingTextChangedListener())
    observableObject.text="Hello"
    observableObject.text="There"
}