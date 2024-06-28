package com.healthcare.projeto_final.controller;

import com.healthcare.projeto_final.dto.PacienteDto;
import com.healthcare.projeto_final.entity.Paciente;
import com.healthcare.projeto_final.repository.PacienteRepository;
import com.healthcare.projeto_final.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Paciente paciente){
        return new ResponseEntity<>(service.cadastro(paciente), HttpStatus.OK);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<PacienteDto>> listar(){
        return new ResponseEntity<>(service.listar(),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable Long id) {
        String resposta = service.remover(id);
        if ("Paciente removido com sucesso.".equals(resposta)) {
            return ResponseEntity.ok(resposta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

