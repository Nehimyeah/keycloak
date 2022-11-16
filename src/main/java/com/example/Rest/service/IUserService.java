package com.example.Rest.service;

import com.example.Rest.entity.User;

public interface IUserService {

    Iterable<User> findAll();

    User findById(long id);
}
