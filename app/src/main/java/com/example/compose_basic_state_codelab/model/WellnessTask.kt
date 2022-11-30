package com.example.compose_basic_state_codelab.model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class WellnessTask(
    val id: Int,
    val label: String,
    var checked: MutableState<Boolean> = mutableStateOf(false)
)