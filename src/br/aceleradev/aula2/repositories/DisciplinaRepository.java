package br.aceleradev.aula2.repositories;

import br.aceleradev.aula2.domain.Aluno;
import br.aceleradev.aula2.domain.Disciplina;
import br.aceleradev.aula2.domain.TiposDisciplina;
import br.aceleradev.aula2.exceptions.NumeroMaximoAlunosException;

import java.util.ArrayList;
import java.util.List;

import static br.aceleradev.aula2.domain.TiposDisciplina.*;

public class DisciplinaRepository {

    List<Disciplina> disciplinas = new ArrayList<>();

    public void criarDisciplina(Disciplina disciplina){

        disciplinas.add(disciplina);

    }

    public void buscarProfessoresPorDisciplina(){

        System.out.println(contarProfessoresPorDisciplina(BIOLOGICAS) + " professores da área biologicas");
        System.out.println(contarProfessoresPorDisciplina(HUMANAS) + " professores da área humanas");
        System.out.println(contarProfessoresPorDisciplina(EXATAS) + " professores da área exatas");

    }

    private int contarProfessoresPorDisciplina(TiposDisciplina tipo) {

        return (int) disciplinas.stream().filter(disciplina -> disciplina.compareTipoDisciplina(tipo)).count();

    }

//    public void matricularAluno(Aluno aluno, TiposDisciplina tipoDisciplina){
//
//        disciplinas.stream().filter()
//
//    }

}
