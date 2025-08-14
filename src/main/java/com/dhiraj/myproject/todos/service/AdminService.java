package com.dhiraj.myproject.todos.service;

import com.dhiraj.myproject.todos.response.UserResponse;

import java.util.List;

public interface AdminService {
    List<UserResponse> getAllUsers();

    UserResponse promoteToAdmin(long userId);

    void deleteNonAdminUser(long userId);
}
