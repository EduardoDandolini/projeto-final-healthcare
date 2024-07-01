package com.healthcare.projeto_final.controller;

import com.healthcare.projeto_final.dto.ProntuarioDto;
import com.healthcare.projeto_final.entity.Prontuario;
import com.healthcare.projeto_final.service.ProntuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prontuario")
@RequiredArgsConstructor
public class ProntuarioController {

    private final ProntuarioService service;

    @PostMapping("/salvar")
    public ResponseEntity<Prontuario> save(@RequestBody ProntuarioDto dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Prontuario>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Prontuario> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Prontuario> update(@PathVariable Long id, @RequestBody ProntuarioDto dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
