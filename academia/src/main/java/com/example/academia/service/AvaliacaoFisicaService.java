package com.example.academia.service;

import com.example.academia.model.AvaliacaoFisica;
import com.example.academia.model.form.AvaliacaoFisicaForm;
import com.example.academia.repository.AlunoRepository;
import com.example.academia.repository.AvaliacaoFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        avaliacaoFisica.setAluno(alunoRepository.findById(form.getAlunoId()).orElse(null));
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());
        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    public void deleteById(Long id) {
        avaliacaoFisicaRepository.deleteById(id);
    }

    public AvaliacaoFisica updateById(Long id, AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaRepository.findById(id).get();
        avaliacaoFisica.setAluno(alunoRepository.findById(form.getAlunoId()).orElse(null));
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());
        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }
}
