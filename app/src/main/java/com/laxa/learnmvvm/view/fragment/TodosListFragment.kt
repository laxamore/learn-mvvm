package com.laxa.learnmvvm.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.laxa.learnmvvm.R
import com.laxa.learnmvvm.model.todos.TodosModel
import com.laxa.learnmvvm.viewmodel.TodosListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.todos_list.view.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@AndroidEntryPoint
class TodosListFragment : Fragment(), View.OnClickListener {
    private val viewModel: TodosListViewModel by viewModels()
    private lateinit var navController: NavController

    private val TAG = "TodosListFragment"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.todos_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        lateinit var todosList: List<TodosModel>

        runBlocking {
            todosList = viewModel.getTodos()
        }

        Log.d(TAG, "onViewCreated: $todosList")

        view.btnTodosListAdd.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.btnTodosListAdd -> {
                navController!!.navigate(R.id.action_todosListFragment_to_todosAddFragment)
            }
        }
    }
}