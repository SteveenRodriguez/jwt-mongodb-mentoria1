package com.DEMOJWT.demo.service;

import java.util.List;

import com.DEMOJWT.demo.dto.User;
import com.DEMOJWT.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UserRepository userRepository;

    public User crear(User user) {
        return userRepository.save(user);
    }

    public List<User> obtenerTodos() {
        return userRepository.findAll();
    }

}
