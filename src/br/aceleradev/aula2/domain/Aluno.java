package br.aceleradev.aula2.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Aluno extends Usuario{

    private Integer numeroMatricula;


    public Aluno(String nome, String login, String cpf, LocalDate dataNascimento) {
        super(nome, login, cpf, dataNascimento);
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return this.getNome().equals(aluno.getNome());
    }

}
