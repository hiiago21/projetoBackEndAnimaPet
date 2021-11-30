package com.example.projetoanimapet.entities.pagamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class PaymentInstallments extends Payment implements Serializable {

    private Integer numberInstallments;
}
