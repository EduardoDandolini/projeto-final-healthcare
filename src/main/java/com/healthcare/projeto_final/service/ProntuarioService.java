package com.healthcare.projeto_final.service;

import com.healthcare.projeto_final.dto.ProntuarioDto;
import com.healthcare.projeto_final.entity.Prontuario;
import com.healthcare.projeto_final.repository.PacienteRepository;
import com.healthcare.projeto_final.repository.ProntuarioRepository;
import com.healthcare.projeto_final.service.interfaces.AbstractService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProntuarioService implements AbstractService<Prontuario, ProntuarioDto> {

    private final ProntuarioRepository repository;
    private final PacienteRepository pacienteRepository;

    @Override
    public Prontuario save(ProntuarioDto entity) {
        var paciente = pacienteRepository.findById(entity.idPaciente()).orElseThrow(() -> new EntityNotFoundException("Paciente não encontrado"));
        return repository.save(Prontuario.builder()
                .convenio(entity.convenio())
                .dataEntrada(entity.dataEntrada())
                .dataAlta(entity.dataAlta())
                .evolucaoMedica(entity.evolucaoMedica())
                .paciente(paciente)
                .build());
    }

    @Override
    public Prontuario findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Prontuário não encontrado"));
    }

    @Override
    public List<Prontuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Prontuario update(Long id, ProntuarioDto entity) {
        var paciente = pacienteRepository.findById(entity.idPaciente()).orElseThrow(() -> new EntityNotFoundException("Paciente não encontrado"));
        return repository.save(Prontuario.builder()
                .convenio(entity.convenio())
                .dataEntrada(entity.dataEntrada())
                .dataAlta(entity.dataAlta())
                .evolucaoMedica(entity.evolucaoMedica())
                .paciente(paciente)
                .build());
    }

    @Override
    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
