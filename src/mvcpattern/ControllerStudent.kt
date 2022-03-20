package mvcpattern

class ControllerStudent(model: ModelStudent, view: ViewStudent) {

    private val model: ModelStudent
    private val view: ViewStudent

    var studentName: String?
        get() = model.name
        set(name) {
            model.name = name
        }
    var studentRollNo: String?
        get() = model.rollNo
        set(rollNo) {
            model.rollNo = rollNo
        }

    fun updateView() {
        view.printStudentDetails(model.name!!, model.rollNo!!)
    }

    init {
        this.model = model
        this.view = view
    }
}