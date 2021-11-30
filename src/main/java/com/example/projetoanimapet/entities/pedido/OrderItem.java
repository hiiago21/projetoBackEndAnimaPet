package com.example.projetoanimapet.entities.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantityItem;
    @OneToOne
    @JoinColumn(name = "product_id")
    @MapsId
    private Product product;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    public Double getTotal(){
        return quantityItem * product.getValue();
    }
}
