package com.laxa.learnmvvm.model.todos.repository

import com.laxa.learnmvvm.model.todos.TodosModel

interface TodosRepository {
    suspend fun getTodos(): List<TodosModel>

    suspend fun getTodo(id: Int): TodosModel?

    suspend fun deleteTodo(todo: TodosModel)

    suspend fun insertTodo(todo: TodosModel)

    suspend fun updateTodo(todo: TodosModel)
}