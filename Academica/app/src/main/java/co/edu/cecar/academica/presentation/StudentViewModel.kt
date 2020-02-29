package co.edu.cecar.academica.presentation

import androidx.lifecycle.ViewModel
import co.edu.cecar.academica.presentation.modelo.Student

class StudentViewModel: ViewModel() {
    fun getStudents() :List <Student> {
        val students =  listOf<Student>()

        val student = arrayListOf<Student>()

        student.add(
            Student(1, "Pablo")
        )



        return student
    }

}