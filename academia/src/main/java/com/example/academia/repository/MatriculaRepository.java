package com.example.academia.repository;

import com.example.academia.model.Aluno;
import com.example.academia.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    List<Matricula> findByAlunoBairro(String bairro);

    Optional<Matricula> findByAluno(Aluno aluno);
}
