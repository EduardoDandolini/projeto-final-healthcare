package com.healthcare.projeto_final.service;

import com.healthcare.projeto_final.dto.ProcedimentoDto;
import com.healthcare.projeto_final.entity.Procedimento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcedimentoService implements AbstractService<Procedimento, ProcedimentoDto>{


    @Override
    public Procedimento save(ProcedimentoDto entity) {
        return null;
    }

    @Override
    public Procedimento findById(Long id) {
        return null;
    }

    @Override
    public List<Procedimento> findAll() {
        return List.of();
    }

    @Override
    public Procedimento update(ProcedimentoDto entity) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
