package com.example.identity_service.controller;

import com.example.identity_service.dto.request.ApiResponse;
import com.example.identity_service.dto.request.UserCreationRequest;
import com.example.identity_service.dto.request.UserUpdateRequest;
import com.example.identity_service.entity.User;
import com.example.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("users/{userId}")
    User getUser(@PathVariable String userId){
        return userService.getUserId(userId);
    }

    @PutMapping("users/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @PostMapping("/users")
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();

        apiResponse.setResult(userService.createRequest(request));

        return apiResponse;
    }

    @DeleteMapping("users/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "Da xoa User Thanh cong";
    }
}
