package com.dhiraj.myproject.todos.service;

import com.dhiraj.myproject.todos.entity.Todo;
import com.dhiraj.myproject.todos.request.TodoRequest;
import com.dhiraj.myproject.todos.response.TodoResponse;

import java.util.List;

public interface TodoService {

    List<TodoResponse> getAllTodos();
    TodoResponse createTodo(TodoRequest todoRequest);
    TodoResponse toggleTodoCompletion(long id);
    void deleteTodo(long id);
}
