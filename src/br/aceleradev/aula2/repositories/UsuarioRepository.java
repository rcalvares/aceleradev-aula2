package br.aceleradev.aula2.repositories;

import br.aceleradev.aula2.domain.Aluno;
import br.aceleradev.aula2.domain.Professor;
import br.aceleradev.aula2.domain.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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

    public List<Aluno> retornaAlunos() {

        List<Aluno> alunos = new ArrayList<>();

        usuarios.forEach(usuario -> {
            if (usuario instanceof Aluno) alunos.add((Aluno) usuario);
        });

        return alunos;
    }

    public double verificarMediaIdadeAlunos(){

        List<Aluno> alunos = retornaAlunos();

        return alunos.stream()
                .mapToDouble(aluno -> Period.between(aluno.getDataNascimento(), LocalDate.now()).getYears())
                .average().getAsDouble();

    }
}
