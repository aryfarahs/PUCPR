public class EscolaPolitec {
    private Professor professor;

    public EscolaPolitec(Professor professor) {
        this.professor = professor;
    }
    public Professor getProfessor() {
        return professor;
    }
    public String getNomeProfessor() {
        return this.professor.getNome();
    }

}
