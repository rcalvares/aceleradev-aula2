package br.aceleradev.aula2.exceptions;

public class LoginInvalidoException extends  RuntimeException{

    public LoginInvalidoException(String message) {
        super(message);
    }
}
