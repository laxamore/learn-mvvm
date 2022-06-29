package com.laxa.learnmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.laxa.learnmvvm.model.todos.repository.TodosRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodosListViewModel @Inject constructor(private val todosRepository: TodosRepository): ViewModel() {
    suspend fun getTodos() = todosRepository.getTodos()
}