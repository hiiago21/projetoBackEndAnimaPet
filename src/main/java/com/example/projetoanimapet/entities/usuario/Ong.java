package com.example.projetoanimapet.entities.usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ong extends User {

    private String cnpjOng;
}
