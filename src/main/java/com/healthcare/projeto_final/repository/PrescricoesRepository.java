package com.healthcare.projeto_final.repository;

import com.healthcare.projeto_final.entity.Prescricoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescricoesRepository extends JpaRepository<Prescricoes,Long> {
}
