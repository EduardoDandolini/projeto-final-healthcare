package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prontuario extends BaseEntity {

    private String nomePaciente;

    private LocalDateTime dataEntrada;

    private LocalDateTime dataAlta;

    private String convenio;

}
