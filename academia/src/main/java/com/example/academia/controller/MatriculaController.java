package com.example.academia.controller;

import com.example.academia.model.Aluno;
import com.example.academia.model.Matricula;
import com.example.academia.model.form.AlunoForm;
import com.example.academia.model.form.MatriculaForm;
import com.example.academia.service.MatriculaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return matriculaService.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(required = false) String bairro){
        return matriculaService.getAll(bairro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        matriculaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Matricula updateById(@PathVariable Long id, @RequestBody MatriculaForm form){
        return matriculaService.updateById(id, form);
    }
}
