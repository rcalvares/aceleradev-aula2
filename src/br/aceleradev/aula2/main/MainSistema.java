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
        Aluno aluno2 = new Aluno("Rafael", "Rafael123", "12345678", LocalDate.of(1990,10,22));

        Professor professor = new Professor("Jose","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor1 = new Professor("Jose1","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor2 = new Professor("Jose2","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor3 = new Professor("Jose3","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor4 = new Professor("Jose4","jose123","123456789", LocalDate.of(1920,10,22));
        Professor professor5 = new Professor("Jose5","jose123","123456789", LocalDate.of(1920,10,22));

        Disciplina disciplina1 = new Disciplina("Matematica", professor, BIOLOGICAS);
        Disciplina disciplina4 = new Disciplina("Matematica", professor, BIOLOGICAS);
        Disciplina disciplina5 = new Disciplina("Matematica", professor, BIOLOGICAS);
        Disciplina disciplina6 = new Disciplina("Matematica", professor, BIOLOGICAS);
        Disciplina disciplina7 = new Disciplina("Matematica", professor, BIOLOGICAS);
        Disciplina disciplina2 = new Disciplina("Matematica", professor, HUMANAS);
        Disciplina disciplina3 = new Disciplina("Matematica", professor, EXATAS);

        disciplinaRepository.criarDisciplina(disciplina1);
        disciplinaRepository.criarDisciplina(disciplina2);
        disciplinaRepository.criarDisciplina(disciplina3);
        disciplinaRepository.criarDisciplina(disciplina4);
        disciplinaRepository.criarDisciplina(disciplina5);
        disciplinaRepository.criarDisciplina(disciplina6);
        disciplinaRepository.criarDisciplina(disciplina7);

        disciplinaRepository.buscarProfessoresPorDisciplina();

        usuarioRepository.insere(aluno1);
        usuarioRepository.insere(aluno2);
        usuarioRepository.insere(professor);

        System.out.println("Idade aluno 1: " + Period.between(aluno1.getDataNascimento(),LocalDate.now()).getYears());
        System.out.println("Idade aluno 2: " + Period.between(aluno2.getDataNascimento(),LocalDate.now()).getYears());

        System.out.println("Media de idade: " + usuarioRepository.verificarMediaIdadeAlunos());

        ;

    }
}
