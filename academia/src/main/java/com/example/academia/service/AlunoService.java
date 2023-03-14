package com.example.academia.service;

import com.example.academia.model.Aluno;
import com.example.academia.model.AvaliacaoFisica;
import com.example.academia.model.Matricula;
import com.example.academia.model.form.AlunoForm;
import com.example.academia.repository.AlunoRepository;
import com.example.academia.repository.AvaliacaoFisicaRepository;
import com.example.academia.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());
        return alunoRepository.save(aluno);
    }

    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return alunoRepository.findById(id).orElse(null).getAvaliacoes();
    }

    public List<Aluno> getAll(LocalDate dataNascimento) {
        if (dataNascimento == null)
            return alunoRepository.findAll();
        return alunoRepository.findByDataNascimento(dataNascimento);
    }

    public void deleteById(Long id) {
        System.out.println(id);
        Aluno aluno = alunoRepository.findById(id).get();
        System.out.println(aluno);

        avaliacaoFisicaRepository.findByAluno(aluno).ifPresent(avaliacaoFisica -> avaliacaoFisicaRepository.delete(avaliacaoFisica));
        matriculaRepository.findByAluno(aluno).ifPresent(matricula -> matriculaRepository.delete(matricula));

        alunoRepository.deleteById(id);
    }

    public Aluno updateById(Long id, AlunoForm form) {
        Aluno aluno = alunoRepository.findById(id).get();
        aluno.setNome(form.getNome());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());
        return alunoRepository.save(aluno);
    }
}
