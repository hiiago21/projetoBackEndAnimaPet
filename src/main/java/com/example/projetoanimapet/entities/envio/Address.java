package com.example.projetoanimapet.entities.envio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer houseNumber;
    private String neighborhood;
    @OneToOne
    @JoinColumn(name = "city_id")
    @MapsId
    private City city;
}
