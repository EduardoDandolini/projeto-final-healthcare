package com.healthcare.projeto_final.dto;

import com.healthcare.projeto_final.entity.Paciente;

public record PacienteDto(
        String nome,
        String cpf,
        String telefone,
        String genero,
        String dataNascimento
) {

}
