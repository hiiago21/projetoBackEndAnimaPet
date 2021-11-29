package com.example.projetoanimapet.entities.envio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    private Long id;
    private String street;
    private Integer houseNumber;
    private String neighborhood;
    private City city;
}
