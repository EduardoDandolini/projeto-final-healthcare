package com.healthcare.projeto_final.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

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

    @OneToMany(mappedBy = "paciente")
    private List<Agendamento> agendamentos;

    @OneToMany(mappedBy = "paciente")
    private List<Prontuario> prontuarios;

    @OneToMany(mappedBy = "paciente")
    private List<Faturamento> contasPaciente;

    @OneToMany(mappedBy = "paciente")
    private List<Prescricoes> prescricoes;
}
