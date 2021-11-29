package com.example.projetoanimapet.entities.pagamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Payment {

    private Double value;
    private LocalDateTime date;

}
