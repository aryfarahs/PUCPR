public class Funcionario extends Pessoa {
    private int idFunc;

    public Funcionario(String name, String email, int anoNasc, String cpf, int idFunc) {
        super(name, email, anoNasc, cpf);
        this.idFunc = idFunc;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void lavar() {

    }
}
