import java.util.ArrayList;
import java.util.List;

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

    public static void imprimirDetalhesFuncionario(ArrayList<List<String>> funcionarios) {
        for (int i = 0; i < funcionarios.size(); i++) {
            List<String> funcionario = funcionarios.get(i);

            if (funcionario != null && funcionario.size() >= 4) {
                System.out.println("Nome: " + funcionario.get(0));
                System.out.println("Email: " + funcionario.get(1));
                System.out.println("CPF: " + funcionario.get(2));
                System.out.println("Cargo: " + funcionario.get(3));
                System.out.println();
            } else {
                System.out.println("Cliente " + (i + 1) + " com dados incompletos.");
            }

        }
    }

}
