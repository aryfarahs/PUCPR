public class Cliente extends Pessoa {
     private Veiculo veiculo;

     public Cliente(String name, String email, int anoNasc, String cpf, Veiculo veiculo) {
          super(name, email, anoNasc, cpf);
          this.veiculo = veiculo;
     }
}
