package br.aceleradev.aula2.domain;

public class Aluno extends Usuario{

    private Integer numeroMatricula;

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Aluno(String nome, String login, String cpf) {
        super(nome, login, cpf);
    }
}
