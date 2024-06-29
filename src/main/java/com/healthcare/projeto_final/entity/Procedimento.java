package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

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
    @ManyToMany(mappedBy = "procedimentos")
    private List<Faturamento> faturamento;


}
