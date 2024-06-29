package com.healthcare.projeto_final.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Faturamento extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "faturamento_procedimento",
            joinColumns = @JoinColumn(name = "faturamento_id"),
            inverseJoinColumns = @JoinColumn(name = "procedimento_id")
    )
    private List<Procedimento> procedimentos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "faturamento_material",
            joinColumns = @JoinColumn(name = "faturamento_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id")
    )
    private List<Material> materiais;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "faturamento_medicamento",
            joinColumns = @JoinColumn(name = "faturamento_id"),
            inverseJoinColumns = @JoinColumn(name = "medicamento_id")
    )
    private List<Medicamento> medicamentos;

    private Double valorTotal;

}
