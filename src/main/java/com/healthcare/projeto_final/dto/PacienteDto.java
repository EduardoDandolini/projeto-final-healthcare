package com.healthcare.projeto_final.dto;

import com.healthcare.projeto_final.entity.Paciente;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record PacienteDto(

        @NotBlank(message = "Nome obrigatorio")
        String nome,
        @CPF(message = "CPF invalido")
        String cpf,
        String telefone,
        String genero,
        @NotBlank(message = "Data de nascimento obrigatorio")
        String dataNascimento
) {

}
