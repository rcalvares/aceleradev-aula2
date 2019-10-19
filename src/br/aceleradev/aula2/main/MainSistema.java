package br.aceleradev.aula2.main;

import br.aceleradev.aula2.domain.Aluno;
import br.aceleradev.aula2.domain.Disciplina;
import br.aceleradev.aula2.domain.Professor;
import br.aceleradev.aula2.domain.Usuario;
import br.aceleradev.aula2.repositories.DisciplinaRepository;
import br.aceleradev.aula2.repositories.UsuarioRepository;

import java.time.LocalDate;
import java.time.Period;

import static br.aceleradev.aula2.domain.TiposDisciplina.*;

public class MainSistema {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        DisciplinaRepository disciplinaRepository = new DisciplinaRepository();

        Aluno aluno1 = new Aluno("Rafael", "Rafael123", "12345678", LocalDate.of(1996,02,22));
        Aluno aluno2 = new Aluno("Rafael2", "Rafael123", "12345678", LocalDate.of(1990,10,22));
        Aluno aluno3 = new Aluno("Rafael3", "Rafael123", "12345678", LocalDate.of(1996,02,22));
        Aluno aluno4 = new Aluno("Rafael4", "Rafael123", "12345678", LocalDate.of(1990,10,22));
        Aluno aluno5 = new Aluno("Rafael5", "Rafael123", "12345678", LocalDate.of(1996,02,22));
        Aluno aluno6 = new Aluno("Rafael6", "Rafael123", "12345678", LocalDate.of(1990,10,22));
        Aluno aluno7 = new Aluno("Rafael7", "Rafael123", "12345678", LocalDate.of(1996,02,22));
        Aluno aluno8 = new Aluno("Rafael8", "Rafael123", "12345678", LocalDate.of(1990,10,22));
        Aluno aluno9 = new Aluno("Rafael9", "Rafael123", "12345678", LocalDate.of(1996,02,22));
        Aluno aluno10 = new Aluno("Rafae10l", "Rafael123", "12345678", LocalDate.of(1990,10,22));

        Professor professor = new Professor("Jose","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor1 = new Professor("Jose1","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor2 = new Professor("Jose2","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor3 = new Professor("Jose3","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor4 = new Professor("Jose4","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor5 = new Professor("Jose5","jose123","123456789", LocalDate.of(1920,10,22));

        Disciplina disciplina1 = new Disciplina("disciplina1", professor, BIOLOGICAS);
        Disciplina disciplina4 = new Disciplina("disciplina4", professor2, EXATAS);
        Disciplina disciplina5 = new Disciplina("disciplina5", professor, BIOLOGICAS);
        Disciplina disciplina6 = new Disciplina("disciplina6", professor1, HUMANAS);
        Disciplina disciplina7 = new Disciplina("disciplina7", professor3, BIOLOGICAS);
        Disciplina disciplina2 = new Disciplina("disciplina2", professor5, HUMANAS);
        Disciplina disciplina3 = new Disciplina("disciplina3", professor2, EXATAS);



        usuarioRepository.insere(aluno1);
        usuarioRepository.insere(aluno2);
        usuarioRepository.insere(aluno3);
        usuarioRepository.insere(aluno4);
        usuarioRepository.insere(aluno5);
        usuarioRepository.insere(aluno6);
        usuarioRepository.insere(aluno7);
        usuarioRepository.insere(aluno8);
        usuarioRepository.insere(aluno9);
        usuarioRepository.insere(aluno10);
        usuarioRepository.insere(professor);
        usuarioRepository.insere(professor1);
        usuarioRepository.insere(professor2);
        usuarioRepository.insere(professor3);
        usuarioRepository.insere(professor4);
        usuarioRepository.insere(professor5);
        disciplinaRepository.criarDisciplina(disciplina1);
        disciplinaRepository.criarDisciplina(disciplina2);
        disciplinaRepository.criarDisciplina(disciplina3);
        disciplinaRepository.criarDisciplina(disciplina4);
        disciplinaRepository.criarDisciplina(disciplina5);
        disciplinaRepository.criarDisciplina(disciplina6);
        disciplinaRepository.criarDisciplina(disciplina7);
        disciplina1.matricularAluno(aluno2);
        disciplina2.matricularAluno(aluno2);
        disciplina3.matricularAluno(aluno2);
        disciplina1.matricularAluno(aluno1);
        disciplina7.matricularAluno(aluno3);
        disciplina6.matricularAluno(aluno3);
        disciplina5.matricularAluno(aluno3);

        System.out.println(disciplinaRepository.verificarNumeroAlunosPorProfessor(professor));


    }
}
