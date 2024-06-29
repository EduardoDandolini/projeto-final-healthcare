package com.healthcare.projeto_final.dto;

import jakarta.validation.constraints.NotBlank;

public record ProcedimentoDto(

        @NotBlank(message = "Nome obrigatorio")
        String nome,
        @NotBlank(message = "Descricao obrigatorio")
        String descricao,
        @NotBlank(message = "Valor obrigatorio")
        Double valor
) {
}
