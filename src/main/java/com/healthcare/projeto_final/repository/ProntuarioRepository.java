package com.healthcare.projeto_final.repository;

import com.healthcare.projeto_final.entity.Prontuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario,Long>
{
}
