package com.vishal.project.uber.uberApp.service;

import com.vishal.project.uber.uberApp.dto.SignUpDto;
import com.vishal.project.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email,String password);
    UserDto signup(SignUpDto signUpDto);
}
