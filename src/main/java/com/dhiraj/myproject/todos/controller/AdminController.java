package com.dhiraj.myproject.todos.controller;


import com.dhiraj.myproject.todos.response.UserResponse;
import com.dhiraj.myproject.todos.service.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Admin REST API Endpoints" , description = "Operations related to a admin")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @Operation(summary = "Get all users", description = "Retrieve a list of all user")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<UserResponse> getAllUsers(){
        return adminService.getAllUsers();
    }


    @Operation(summary = "Promote user to admin", description = "Promote  admin to usr role ")
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{userId}/role")
    public UserResponse promoteToAdmin(@PathVariable @Min(1) long userId){
        return  adminService.promoteToAdmin(userId);
    }

    @Operation(summary = "Delete users", description = "Delete non-admin user from system")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable @Min(1) long userId){
        adminService.deleteNonAdminUser(userId);
    }

}
