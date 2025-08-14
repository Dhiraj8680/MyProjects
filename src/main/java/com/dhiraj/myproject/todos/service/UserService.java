package com.dhiraj.myproject.todos.service;

import com.dhiraj.myproject.todos.request.PasswordUpdateRequest;
import com.dhiraj.myproject.todos.response.UserResponse;

public interface UserService {
    UserResponse getUserInfo();

    void deleteUser();

    void updatePassword(PasswordUpdateRequest passwordUpdateRequest);
}
