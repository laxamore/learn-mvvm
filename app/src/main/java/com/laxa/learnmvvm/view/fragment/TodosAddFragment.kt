package com.laxa.learnmvvm.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.laxa.learnmvvm.R
import com.laxa.learnmvvm.model.todos.TodosModel
import com.laxa.learnmvvm.viewmodel.TodosAddViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.todos_add.view.*
import kotlinx.android.synthetic.main.todos_list.view.*
import kotlinx.coroutines.runBlocking

@AndroidEntryPoint
class TodosAddFragment : Fragment(), View.OnClickListener {
    private val TAG = TodosAddFragment::class.java.simpleName
    private val viewModel: TodosAddViewModel by viewModels()

    private lateinit var editTextTodosAddTitle: EditText
    private lateinit var editTextTodosAddDescription: EditText

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.todos_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btnTodosAddAdd.setOnClickListener(this)

        editTextTodosAddTitle = view.editTextTodosAddTitle
        editTextTodosAddDescription = view.editTextTodosAddDescription
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnTodosAddAdd -> {
                var newTodo: TodosModel = TodosModel(
                    title = editTextTodosAddTitle.text.toString(),
                    description = editTextTodosAddDescription.text.toString(),
                    completed = false
                )

                runBlocking {
                    viewModel.insertTodo(newTodo)
                }
            }
        }
    }
}