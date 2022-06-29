package com.laxa.learnmvvm.model.todos.dao

import androidx.room.*
import com.laxa.learnmvvm.model.todos.TodosModel

@Dao
interface TodosDao {
    @Query("SELECT * FROM todos")
    suspend fun getTodos(): List<TodosModel>

    @Query("SELECT * FROM todos WHERE id = :id")
    suspend fun getTodo(id: Int): TodosModel?

    @Delete
    suspend fun deleteTodo(todo: TodosModel)

    @Insert
    suspend fun insertTodo(todo: TodosModel)

    @Update
    suspend fun updateTodo(todo: TodosModel)
}
