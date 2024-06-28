package com.healthcare.projeto_final.repository;

import com.healthcare.projeto_final.entity.Faturamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamento, Long> {
}
