package com.laxa.learnmvvm.view.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.laxa.learnmvvm.R
import com.laxa.learnmvvm.model.todos.TodosModel

class TodosListAdapter(private val todos: List<TodosModel>) : RecyclerView.Adapter<TodosListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodosListAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TodosListAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView: TextView = itemView.findViewById(R.id.todosListRVTitleTV)
        val descriptionView: TextView = itemView.findViewById(R.id.todosListRVDescriptionTV)
        val completedView: CheckBox = itemView.findViewById(R.id.todosListRVCompletedCB)
    }
}