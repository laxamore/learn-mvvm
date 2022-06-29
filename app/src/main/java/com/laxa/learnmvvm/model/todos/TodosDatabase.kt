package com.laxa.learnmvvm.model.todos

import androidx.room.Database
import androidx.room.RoomDatabase
import com.laxa.learnmvvm.model.todos.dao.TodosDao

@Database(entities = [TodosModel::class], version = 2)
abstract class TodosDatabase : RoomDatabase() {
    abstract val todosDao: TodosDao
}