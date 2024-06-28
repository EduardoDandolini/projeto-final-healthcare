package com.healthcare.projeto_final.service;

import com.healthcare.projeto_final.dto.PacienteDto;
import com.healthcare.projeto_final.entity.Paciente;
import com.healthcare.projeto_final.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    public List<PacienteDto> listar(){
        List<Paciente> paciente = repository.findAll();
        return paciente.stream().map(x -> new PacienteDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Paciente paciente){
        repository.save(paciente);
        return "Cadastrado.";
    }


    public String remover(Long id) {
        Paciente paciente = repository.findById(id).orElse(null);
        if (paciente != null) {
            repository.deleteById(id);
            return "Paciente removido com sucesso.";
        } else {
            return "Paciente não encontrado.";
        }
    }

}
