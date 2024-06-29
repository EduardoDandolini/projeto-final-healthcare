package com.healthcare.projeto_final.service;

import com.healthcare.projeto_final.dto.ProcedimentoDto;
import com.healthcare.projeto_final.entity.Procedimento;
import com.healthcare.projeto_final.repository.ProcedimentoRepository;
import com.healthcare.projeto_final.service.interfaces.AbstractService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProcedimentoService implements AbstractService<Procedimento, ProcedimentoDto> {

    private final ProcedimentoRepository repository;

    @Override
    public Procedimento save(ProcedimentoDto entity) {
        return repository.save(Procedimento.builder()
                .nome(entity.nome())
                .valor(entity.valor())
                .descricao(entity.descricao())
                .build());
    }

    @Override
    public Procedimento findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Procedimento não encontrado"));
    }

    @Override
    public List<Procedimento> findAll() {
        return repository.findAll();
    }

    @Override
    public Procedimento update(Long id,ProcedimentoDto entity) {
        var procedimento = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Procedimento não encontrado"));
        procedimento.setNome(entity.nome());
        procedimento.setValor(entity.valor());
        procedimento.setDescricao(entity.descricao());
        return repository.save(procedimento);
    }

    @Override
    public void deleteById(Long id) {
      if(repository.existsById(id)){
          repository.deleteById(id);
      }
    }
}
