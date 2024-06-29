package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Procedimento extends BaseEntity{

    private String nome;
    private String descricao;
    private Double valor;

}
