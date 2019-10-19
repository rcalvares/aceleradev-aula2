package br.aceleradev.aula2.domain;

import br.aceleradev.aula2.exceptions.LoginInvalidoException;

import static br.aceleradev.aula2.utils.MensagemException.LOGIN_MENOR_DE_TRES_CARACTERES;

public class Usuario {

    private String nome;
    private String login;
    private String cpf;

    public Usuario(String nome, String login, String cpf) {
        this.nome = nome;
        setLogin(login);
        this.cpf = cpf;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (!validaLogin(login)) throw new LoginInvalidoException(LOGIN_MENOR_DE_TRES_CARACTERES);
        this.login = login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private boolean validaLogin(String login){

        return login.length() > 3;

    }

    @Override
    public String toString() {
        return "nome: " + this.nome
                + "\nlogin: " + this.login
                + "\ncpf: " + this.cpf;
    }


}
