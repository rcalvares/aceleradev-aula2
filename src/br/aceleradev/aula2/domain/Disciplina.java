package br.aceleradev.aula2.domain;

import br.aceleradev.aula2.exceptions.NumeroMaximoAlunosException;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private TiposDisciplina tipoDisciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public TiposDisciplina getTipoDisciplina() {
        return tipoDisciplina;
    }

    public void setTipoDisciplina(TiposDisciplina tipoDisciplina) {
        this.tipoDisciplina = tipoDisciplina;
    }

    public Disciplina(String nome, Professor professor, TiposDisciplina tipoDisciplina) {
        this.nome = nome;
        this.professor = professor;
        this.tipoDisciplina = tipoDisciplina;
    }


    public void mostrarAlunos(){
        alunos.forEach(System.out::println);
    }

    public boolean compareTipoDisciplina(TiposDisciplina tipoDisciplina) {
        return this.tipoDisciplina.equals(tipoDisciplina);
    }

}
