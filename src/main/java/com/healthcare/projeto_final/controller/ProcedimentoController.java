package com.healthcare.projeto_final.controller;

import com.healthcare.projeto_final.dto.ProcedimentoDto;
import com.healthcare.projeto_final.entity.Procedimento;
import com.healthcare.projeto_final.service.ProcedimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/procedimento")
@RequiredArgsConstructor
public class ProcedimentoController {

    private final ProcedimentoService service;

    @PostMapping("/salvar")
    public ResponseEntity<Procedimento> save(@RequestBody ProcedimentoDto dto){
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Procedimento>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Procedimento> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Procedimento> atualizar(@PathVariable Long id, @RequestBody ProcedimentoDto dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/deletar")
    public ResponseEntity<Void> deletar(@RequestBody Long id){
        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
