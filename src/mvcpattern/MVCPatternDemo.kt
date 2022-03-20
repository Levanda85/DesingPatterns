package mvcpattern

object MVCPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {

        //fetch student record based on his roll no from the database
        val model: ModelStudent = retrieveStudentFromDatabase()

        //Create a view : to write student details on console
        val view = ViewStudent()
        val controller = ControllerStudent(model, view)
        controller.updateView()

        //update model data
        controller.studentName = "John"
        controller.studentRollNo = "25"
        controller.updateView()
    }

    private fun retrieveStudentFromDatabase(): ModelStudent {
        val student = ModelStudent()
        student.name = "Robert"
        student.rollNo = "10"
        return student
    }
}