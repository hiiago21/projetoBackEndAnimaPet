package com.example.projetoanimapet.entities.envio;

import com.example.projetoanimapet.entities.pedido.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShippingForm {

    private Order order;
    private Address address;
    private LocalDateTime shippingDate;
}
