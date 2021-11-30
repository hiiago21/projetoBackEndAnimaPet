package com.example.projetoanimapet.entities.envio;

import com.example.projetoanimapet.entities.pedido.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ShippingForm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Order order;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    private LocalDateTime shippingDate;
}
