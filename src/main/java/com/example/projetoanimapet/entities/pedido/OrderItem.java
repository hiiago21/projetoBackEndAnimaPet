package com.example.projetoanimapet.entities.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItem {

    private Integer quantityItem;
    private Product product;

    //TODO getTotalValorItem
}
