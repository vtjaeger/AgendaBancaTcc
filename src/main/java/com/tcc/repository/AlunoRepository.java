package com.tcc.repository;

import com.tcc.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    boolean existsByNome(String nome);
    Aluno findByNome(String nome);

}

