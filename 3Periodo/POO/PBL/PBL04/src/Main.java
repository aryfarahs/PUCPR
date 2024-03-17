public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Sheila", "67437278");
        Disciplina disciplina = new Disciplina("Engenharia de Requisitos", professor);

        Aluno aluno = new Aluno("Ary", "10220110246");
        Aluno aluno1 = new Aluno("Ícaro", "98765432001");
        Aluno aluno2 = new Aluno("Adriano", "12345678910");
        Aluno aluno3 = new Aluno("Mariana", "67482901012");
        Aluno aluno4 = new Aluno("Luiza", "10203040500");
        Aluno aluno5 = new Aluno("Vinicius", "24692469420");
        Aluno aluno6 = new Aluno("Gabriel", "80808080000");

        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);
        disciplina.matricularAluno(aluno3);
        disciplina.matricularAluno(aluno4);
        disciplina.matricularAluno(aluno5);
        disciplina.matricularAluno(aluno6);
        disciplina.matricularAluno(new Aluno("Felipe", "10987654321"));
        disciplina.matricularAluno(new Aluno("Rafael", "10020030060"));
        disciplina.matricularAluno(new Aluno("Sofia", "45678910234"));

        disciplina.matricularAluno(new Aluno("Igor", "19283746510"));

        EscolaPolitec politecnica = new EscolaPolitec(new Professor("Marina", "74123698"));

        System.out.println("Nome do professor Main: " + professor.getNome());
        disciplina.imprimirInfo();
        System.out.println("Nome do professor da Politécnica: " + politecnica.getNomeProfessor());

        disciplina.subProfessor("23578940215", "Regina");

        System.out.println("Nome do professor Main: " + professor.getNome());
        disciplina.imprimirInfo();
        System.out.println("Nome do professor da Politécnica: " + politecnica.getProfessor().getNome());

        System.out.println(professor);
        System.out.println(disciplina.getProfessor());

    }
}