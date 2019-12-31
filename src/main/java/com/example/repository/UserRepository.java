package com.example.repository;

import com.example.model.User;

public interface UserRepository {
    User findByUsername(String username);

    User save(User user);
}
