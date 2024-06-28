package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Medicamento extends BaseEntity{

    private String nome;
    private String descricao;
    private Integer quantidade;
    private Double preco;
}
