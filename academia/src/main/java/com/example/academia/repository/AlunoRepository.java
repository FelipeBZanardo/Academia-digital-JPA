package com.example.academia.repository;

import com.example.academia.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByDataNascimento(LocalDate dataNascimento);
}
