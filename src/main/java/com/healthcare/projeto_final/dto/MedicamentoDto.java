package com.healthcare.projeto_final.dto;

public record MedicamentoDto(
        String nome,
        String descricao,
        Integer quantidade,
        Double preco
) {
}
