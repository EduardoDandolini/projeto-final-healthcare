package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Material extends BaseEntity{

    private String nome;
    private Integer quantidade;
    private String descricao;



}
