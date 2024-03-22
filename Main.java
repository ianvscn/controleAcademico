package controle_academico;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
        // Criando um professor
        Professor professor = new Professor();
        professor.setNome("João Silva");
        professor.setHorario("Segunda a sexta, 8h às 17h");

        // Criando uma disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Programação Java");
        disciplina.setProfessor(professor);

        // Criando alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pedro");

        // Adicionando alunos à disciplina
        List<Aluno> alunosDisciplina = new ArrayList<>();
        alunosDisciplina.add(aluno1);
        alunosDisciplina.add(aluno2);
        disciplina.setAlunos(alunosDisciplina);

        // Definindo horário das aulas da disciplina
        disciplina.setHorarioAulas("Segunda e quarta, 14h às 16h");

        // Obtendo informações
        System.out.println("Professor: " + disciplina.getProfessor().getNome());
        System.out.println("Horário de trabalho do professor: " + disciplina.getProfessor().getHorario());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Horário das aulas: " + disciplina.getHorarioAulas());
        System.out.println("Alunos matriculados na disciplina:");
        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }
    }

}
