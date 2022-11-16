package com.example.Rest.controller;

import com.example.Rest.entity.User;
import com.example.Rest.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService service;

    @GetMapping
    @RolesAllowed("admin")
    public Iterable<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @RolesAllowed("user1")
    public User findById(@PathVariable long id) {
        return service.findById(id);
    }
}
