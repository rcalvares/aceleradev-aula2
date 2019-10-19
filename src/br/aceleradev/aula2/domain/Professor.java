package br.aceleradev.aula2.domain;

import java.time.LocalDate;

public class Professor extends  Usuario{

    public Professor(String nome, String login, String cpf, LocalDate dataNascimento) {
        super(nome, login, cpf, dataNascimento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return this.getNome().equals(professor.getNome());    }
}
