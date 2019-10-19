package br.aceleradev.aula2.repositories;

import br.aceleradev.aula2.domain.Aluno;
import br.aceleradev.aula2.domain.Professor;
import br.aceleradev.aula2.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    List<Usuario> usuarios = new ArrayList<>();

    public void insere(Usuario usuario){

        usuarios.add(usuario);

    }

    public void mostraAlunos() {

        usuarios.forEach(usuario -> {
            if (usuario instanceof Aluno) System.out.println(usuario);
        });

    }

    public void mostraProfessores() {

        usuarios.forEach(usuario -> {
            if (usuario instanceof Professor) System.out.println(usuario);
        });

    }
}
