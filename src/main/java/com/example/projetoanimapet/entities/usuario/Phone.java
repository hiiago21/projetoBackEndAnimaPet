package com.example.projetoanimapet.entities.usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Phone {

    private Integer ddd;
    private String number;
    private Character type;
    private String nameContact;
}
