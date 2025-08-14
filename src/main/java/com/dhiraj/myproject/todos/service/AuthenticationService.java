package com.dhiraj.myproject.todos.service;

import com.dhiraj.myproject.todos.request.AuthenticationRequest;
import com.dhiraj.myproject.todos.request.RegisterRequest;
import com.dhiraj.myproject.todos.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
