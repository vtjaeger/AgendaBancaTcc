package com.tcc.repository;

import com.tcc.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Professor findByNome(String nome);
    boolean findByhorariosDisponiveis(LocalDateTime professor);
    boolean existsByNome(String orientador);
}
