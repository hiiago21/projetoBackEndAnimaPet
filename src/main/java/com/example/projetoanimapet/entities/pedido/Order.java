package com.example.projetoanimapet.entities.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private LocalDateTime orderDate;
    private OrderItem orderItem;

    //TODO valorTotalDaCOmpra
}
