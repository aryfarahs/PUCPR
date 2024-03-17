import java.sql.SQLOutput;

public class Disciplina {
    private String nome;
    private int qntAlunos = 0;
    private Professor professor;
    private Aluno[] alunos = new Aluno[10];

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }
    public Disciplina(String nome, String nomeProf, String codRh) {
        this.nome = nome;
        this.professor = new Professor(nomeProf, codRh);
    }

    public void matricularAluno(Aluno aluno) {
        if(qntAlunos == 10) {
            System.out.println("Não foi possível realizar a matrícula, turma está cheia!");
            return;
        }

        alunos[qntAlunos] = aluno;
        qntAlunos++;
        System.out.println(aluno.getNome() + " matriculado(a) com sucesso!");
    }

    public void imprimirInfo() {
        System.out.println("DISCIPLINA XXX");
        System.out.print("Disciplina: " + this.nome + "\nProfessor: " + this.professor.getNome());
        System.out.println("\nAlunos Matriculados: ");
        for (int i = 0; i < qntAlunos; i++) {
            System.out.println("Aluno " + (i+1) + ": " + alunos[i].getNome());
        }
    }

    public void subProfessor(String codRh, String nome) {
        this.professor.setNome(nome);
        this.professor.setCodRh(codRh);
    }
    public Professor getProfessor() {
        return professor;
    }
}
