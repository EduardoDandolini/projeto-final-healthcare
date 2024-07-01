package com.healthcare.projeto_final.dto;

import java.time.LocalDateTime;

public record ProntuarioDto(
        Long idPaciente,

        LocalDateTime dataEntrada,

        LocalDateTime dataAlta,

        String convenio,

        String evolucaoMedica
) {
}
