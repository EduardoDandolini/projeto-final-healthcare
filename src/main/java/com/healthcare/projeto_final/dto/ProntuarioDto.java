package com.healthcare.projeto_final.dto;

import java.time.LocalDateTime;

public record ProntuarioDto(
        String nomePaciente,

        LocalDateTime dataEntrada,

        LocalDateTime dataAlta,

        String convenio
) {
}
