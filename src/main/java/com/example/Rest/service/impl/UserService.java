package com.example.Rest.service.impl;

import com.example.Rest.entity.User;
import com.example.Rest.repository.UserRepo;
import com.example.Rest.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepo repo;

    @Override
    public Iterable<User> findAll() {
        return repo.findAll();
    }

    @Override
    public User findById(long id) {
        return repo.findById(id).orElse(null);
    }

}
