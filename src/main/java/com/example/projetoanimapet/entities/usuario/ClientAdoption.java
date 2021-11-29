package com.example.projetoanimapet.entities.usuario;

import com.example.projetoanimapet.entities.adocao.Adoption;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class ClientAdoption extends User {

    private String cpfAdotante;
    private Adoption adocao;
}
