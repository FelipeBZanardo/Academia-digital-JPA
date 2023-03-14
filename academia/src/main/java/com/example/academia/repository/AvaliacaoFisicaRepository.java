package com.example.academia.repository;

import com.example.academia.model.Aluno;
import com.example.academia.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {

    Optional<AvaliacaoFisica> findByAluno(Aluno aluno);
}
