package com.healthcare.projeto_final.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_material")
public class Material extends BaseEntity {

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "descricao")
    private String descricao;

    @ManyToMany(mappedBy = "materiais")
    private List<Faturamento> faturamento;

}
