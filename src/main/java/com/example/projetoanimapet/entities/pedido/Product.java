package com.example.projetoanimapet.entities.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Product {

    private Long id;
    private Integer quantityStock;
    private Double value;
    private String name;
}
