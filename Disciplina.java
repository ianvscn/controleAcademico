package controle_academico;
import java.util.List;

class Disciplina {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;
    private String horarioAulas;

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getHorarioAulas() {
        return horarioAulas;
    }

    public void setHorarioAulas(String horarioAulas) {
        this.horarioAulas = horarioAulas;
    }
}