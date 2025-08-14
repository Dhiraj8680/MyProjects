package com.dhiraj.myproject.todos.controller;


import com.dhiraj.myproject.todos.request.AuthenticationRequest;
import com.dhiraj.myproject.todos.request.RegisterRequest;
import com.dhiraj.myproject.todos.response.AuthenticationResponse;
import com.dhiraj.myproject.todos.service.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Authentication REST API Endpoints", description = "Operations related to register and login")
public class AuthenticationController {
    private final AuthenticationService authenticationService;


    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @Operation(summary = "Register a user" , description = "Create new user in DB")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/register")
    public void register(@Valid @RequestBody RegisterRequest registerRequest) throws Exception{
        authenticationService.register(registerRequest);

    }

    @Operation(summary = "Login a user",description = "Submit email and password")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    public AuthenticationResponse login(@Valid @RequestBody AuthenticationRequest authRequest) {
        return authenticationService.login(authRequest);
    }
}
