package br.aceleradev.aula2.domain;

import br.aceleradev.aula2.exceptions.NumeroMaximoAlunosException;
import br.aceleradev.aula2.main.exceptions.AlunoExistenteException;

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

    public void matricularAluno(Aluno aluno){


        if (this.alunos.size() > 10) throw new NumeroMaximoAlunosException("Lotada");
        if (this.alunos.contains(aluno)) throw new AlunoExistenteException("Aluno já matriculado");

        alunos.add(aluno);

    }

    public boolean verificaProfessor(Professor professor){
        return this.professor.equals(professor);
    }

    public int retornaQuantidadeAlunos() {
        return this.alunos.size();
    }
}


