package br.aceleradev.aula2.domain;

import br.aceleradev.aula2.exceptions.NumeroMaximoAlunosException;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void matricular(Aluno aluno){
        if(alunos.size() == 10) throw new NumeroMaximoAlunosException("Disciplina lotada");
        alunos.add(aluno);
    }

    public void mostrarAlunos(){
        alunos.forEach(System.out::println);

    }
}
