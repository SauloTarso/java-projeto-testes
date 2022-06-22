package com.saulo.javaprojetotestes.services;

import com.saulo.javaprojetotestes.domain.User;
import com.saulo.javaprojetotestes.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
