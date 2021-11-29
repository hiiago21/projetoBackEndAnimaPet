package com.example.projetoanimapet.entities.usuario;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public abstract class User {

    private Long userId;
    private String name;
    private String email;
    private List<Phone> phones;

}
