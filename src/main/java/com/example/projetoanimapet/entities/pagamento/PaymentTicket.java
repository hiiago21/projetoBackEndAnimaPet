package com.example.projetoanimapet.entities.pagamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentTicket extends Payment {

    private LocalDateTime dueDate;
    private LocalDateTime paymenteDate;
}
