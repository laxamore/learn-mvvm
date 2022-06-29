package com.laxa.learnmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.laxa.learnmvvm.model.todos.TodosModel
import com.laxa.learnmvvm.model.todos.repository.TodosRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodosAddViewModel @Inject constructor(private val todosRepository: TodosRepository) : ViewModel() {
    suspend fun insertTodo(todos: TodosModel) {
        todosRepository.insertTodo(todos)
    }
}