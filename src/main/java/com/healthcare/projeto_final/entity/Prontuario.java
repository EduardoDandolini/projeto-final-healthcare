package com.healthcare.projeto_final.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prontuario extends BaseEntity {

    private String evolucaoMedica;

    private LocalDateTime dataEntrada;

    private LocalDateTime dataAlta;

    private String convenio;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}
