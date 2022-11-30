package com.example.compose_basic_state_codelab.viewmodel

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.compose_basic_state_codelab.model.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTaskList().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        tasks.find { it.id == item.id }?.let { task ->
            task.checked.value = checked
        }

    private fun getWellnessTaskList() = List(30) { i -> WellnessTask(i, "Task #$i") }

}