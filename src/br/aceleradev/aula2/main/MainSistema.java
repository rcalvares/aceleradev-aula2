package br.aceleradev.aula2.main;

import br.aceleradev.aula2.domain.Aluno;
import br.aceleradev.aula2.domain.Disciplina;
import br.aceleradev.aula2.domain.Professor;
import br.aceleradev.aula2.repositories.UsuarioRepository;

public class MainSistema {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Aluno aluno1 = new Aluno("Rafael", "Rafael123", "12345678");
        Aluno aluno2 = new Aluno("Rafael", "Rafael123", "12345678");

        Professor professor = new Professor("Jose","jose123","123456789");

//        Disciplina disciplina = new Disciplina("Matematica", professor);

        usuarioRepository.insere(aluno1);
        usuarioRepository.insere(aluno2);
        usuarioRepository.insere(professor);

        System.out.println("Professores:");
        usuarioRepository.mostraProfessores();

        System.out.println("Alunos:");
        usuarioRepository.mostraAlunos();
//        disciplina.matricular(aluno1);

//        disciplina.mostrarAlunos();

    }
}
