package com.vishal.project.uber.uberApp.dto;

import com.vishal.project.uber.uberApp.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private String name;
    private String email;
    private Set<Role> roles;
}
