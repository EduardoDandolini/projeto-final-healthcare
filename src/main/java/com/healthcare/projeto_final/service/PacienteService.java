package com.healthcare.projeto_final.service;

import com.healthcare.projeto_final.dto.PacienteDto;
import com.healthcare.projeto_final.entity.Paciente;
import com.healthcare.projeto_final.repository.PacienteRepository;
import com.healthcare.projeto_final.service.interfaces.AbstractService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PacienteService implements AbstractService<Paciente, PacienteDto> {

    private final PacienteRepository repository;

    @Override
    public Paciente save(PacienteDto entity) {
        return repository.save(Paciente.builder()
                .nome(entity.nome())
                .cpf(entity.cpf())
                .dataNascimento(entity.dataNascimento())
                .genero(entity.genero())
                .telefone(entity.telefone())
                .build());
    }

    @Override
    public Paciente findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Paciente não encontrado"));
    }

    @Override
    public List<Paciente> findAll() {
        return repository.findAll();
    }

    @Override
    public Paciente update(Long id, PacienteDto entity) {
        var paciente = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Paciente não encontrado"));
        paciente.setNome(entity.nome());
        paciente.setCpf(entity.cpf());
        paciente.setDataNascimento(entity.dataNascimento());
        paciente.setGenero(entity.genero());
        paciente.setTelefone(entity.telefone());
        return repository.save(paciente);
    }

    @Override
    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
