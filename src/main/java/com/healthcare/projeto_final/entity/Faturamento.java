package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Faturamento extends BaseEntity{

//    private Procedimento procedimento;
//    private Material material;
//    private Medicamento medicamento;
    private Double valorTotal;

}
