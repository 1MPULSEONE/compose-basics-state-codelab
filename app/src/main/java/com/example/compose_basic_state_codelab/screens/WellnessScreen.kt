package com.example.compose_basic_state_codelab.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compose_basic_state_codelab.composables.StatefulCounter
import com.example.compose_basic_state_codelab.composables.WellnessTaskList
import com.example.compose_basic_state_codelab.viewmodel.WellnessViewModel


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column {
        StatefulCounter()
        val list = wellnessViewModel.tasks
        WellnessTaskList(
            list = list,
            modifier = modifier,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task -> wellnessViewModel.remove(task) }
        )
    }
}



