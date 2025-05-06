package com.example.mobile1project.ids.student.viewmodels

import androidx.lifecycle.ViewModel
import com.example.mobile1project.ids.student.models.Student
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class StudentViewModel : ViewModel() {
    private val _students = MutableStateFlow(
        listOf(
            Student("Jorge Parra Hidalgo"),
            Student("Jose Ricardo Holguín Chiquito"),
            Student("Yajahira Payán Palma"),
            Student("Ian Alejandro Corral Marín"),
            Student("Jesús Omar Acuña Martínez")
        )
    )
    val students: StateFlow<List<Student>> = _students
}