package com.example.projetoanimapet.entities.usuario;

import com.example.projetoanimapet.entities.adocao.Adoption;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
public class ClientAdoption extends User {

    private String cpfAdotante;
    @OneToOne(mappedBy = "clientAdoption", cascade = CascadeType.ALL)
    private Adoption adocao;
}
