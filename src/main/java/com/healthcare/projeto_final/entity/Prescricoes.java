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
public class Prescricoes extends BaseEntity{

    private String nome;

    private LocalDateTime data;

    private String nomeMedico;


}
