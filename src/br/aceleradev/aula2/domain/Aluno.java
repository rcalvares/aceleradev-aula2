package br.aceleradev.aula2.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aluno extends Usuario{

    private Integer numeroMatricula;

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Aluno(String nome, String login, String cpf, LocalDate dataNascimento) {
        super(nome, login, cpf, dataNascimento);
    }

}
