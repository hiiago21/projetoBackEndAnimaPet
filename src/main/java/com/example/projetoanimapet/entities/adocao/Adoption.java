package com.example.projetoanimapet.entities.adocao;

import com.example.projetoanimapet.entities.usuario.ClientAdoption;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
public class Adoption implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "pet_id")
    @MapsId
    private Pet pet;
    @OneToOne
    private ClientAdoption clientAdoption;
}
