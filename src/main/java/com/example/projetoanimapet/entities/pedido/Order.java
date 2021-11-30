package com.example.projetoanimapet.entities.pedido;

import com.example.projetoanimapet.entities.envio.ShippingForm;
import com.example.projetoanimapet.entities.pagamento.Payment;
import com.example.projetoanimapet.entities.usuario.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime orderDate;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "shipping_id")
    private ShippingForm shippingForm;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    public Double getTotalOrder(){
        return orderItems.stream().mapToDouble(OrderItem::getTotal).sum();
    }
}
