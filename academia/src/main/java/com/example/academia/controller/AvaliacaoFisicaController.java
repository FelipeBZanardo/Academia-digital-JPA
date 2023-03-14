package com.example.academia.controller;

import com.example.academia.model.Aluno;
import com.example.academia.model.AvaliacaoFisica;
import com.example.academia.model.form.AlunoForm;
import com.example.academia.model.form.AvaliacaoFisicaForm;
import com.example.academia.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return avaliacaoFisicaService.create(form);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return avaliacaoFisicaService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        avaliacaoFisicaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica updateById(@PathVariable Long id, @RequestBody AvaliacaoFisicaForm form){
        return avaliacaoFisicaService.updateById(id, form);
    }

}
