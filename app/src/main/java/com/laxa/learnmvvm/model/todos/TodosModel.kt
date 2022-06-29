package com.laxa.learnmvvm.model.todos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class TodosModel (
    @PrimaryKey var id: Int? = null,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "completed")
    var completed: Boolean,

    @ColumnInfo(name = "userId")
    var description: String
)