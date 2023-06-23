package ru.flamexander.spring.security.jwt.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.flamexander.spring.security.jwt.entities.Role;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String email;
}
