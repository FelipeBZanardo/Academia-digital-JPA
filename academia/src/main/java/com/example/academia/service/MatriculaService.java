package com.example.academia.service;

import com.example.academia.model.Matricula;
import com.example.academia.model.form.MatriculaForm;
import com.example.academia.repository.AlunoRepository;
import com.example.academia.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        matricula.setAluno(alunoRepository.findById(form.getAlunoId()).orElse(null));
        return matriculaRepository.save(matricula);
    }

    public List<Matricula> getAll(String bairro) {
        if(bairro == null)
            return matriculaRepository.findAll();
        return matriculaRepository.findByAlunoBairro(bairro);
    }

    public void deleteById(Long id) {
        matriculaRepository.deleteById(id);
    }

    public Matricula updateById(Long id, MatriculaForm form) {
        Matricula matricula = matriculaRepository.findById(id).get();
        matricula.setAluno(alunoRepository.findById(form.getAlunoId()).orElse(null));
        return matriculaRepository.save(matricula);
    }
}
