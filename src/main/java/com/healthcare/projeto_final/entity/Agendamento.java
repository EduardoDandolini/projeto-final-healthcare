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
public class Agendamento extends BaseEntity{

    private String motivo;

    private LocalDateTime dataHora;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}
