package com.laxa.learnmvvm.model.todos.repository

import com.laxa.learnmvvm.model.todos.TodosModel
import com.laxa.learnmvvm.model.todos.dao.TodosDao

class TodosRepositoryImpl(private val dao: TodosDao) : TodosRepository {
    override suspend fun getTodos(): List<TodosModel> {
        return dao.getTodos()
    }

    override suspend fun getTodo(id: Int): TodosModel? {
        return dao.getTodo(id)
    }

    override suspend fun deleteTodo(todo: TodosModel) {
        return dao.deleteTodo(todo)
    }

    override suspend fun insertTodo(todo: TodosModel) {
        dao.insertTodo(todo)
    }

    override suspend fun updateTodo(todo: TodosModel) {
        dao.updateTodo(todo)
    }
}