package eu.tutorials.counterapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel(){
    private val _count = mutableStateOf(0)
    val count: State<Int> = _count

    fun increment(){
        _count.value += 1
    }

    fun decrement(){
        _count.value -= 1
    }
}