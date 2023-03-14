package com.example.academia.controller;

import com.example.academia.model.Aluno;
import com.example.academia.model.AvaliacaoFisica;
import com.example.academia.model.form.AlunoForm;
import com.example.academia.repository.AlunoRepository;
import com.example.academia.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return alunoService.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return alunoService.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(required = false) LocalDate dataNascimento){
        return alunoService.getAll(dataNascimento);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable Long id){
        alunoService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Aluno updateById(@PathVariable Long id, @RequestBody AlunoForm form){
        return alunoService.updateById(id, form);
    }
}
