package com.example.academia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    private LocalDate dataDaAvaliacao = LocalDate.now();
    @Column(name = "peso_atual")
    private double peso;
    @Column(name = "altura_atual")
    private double altura;
}
