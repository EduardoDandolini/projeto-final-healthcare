package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Paciente extends BaseEntity{

    private String nome;

    private String cpf;

    private String telefone;

    private String genero;

    private String dataNascimento;

}
