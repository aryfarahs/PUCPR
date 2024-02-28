public class computer {
    
    public String cor;
    public String marca;
    public int ano;
    public String modelo;
    public float qtdeMemoria;
    public char tipo;
    public boolean ligado; 

    public void ligar() {
        System.out.println("Bem vindo!");
        ligado = true;
    }

    public void desligar() {
        System.out.println("O computador está sendo DESLIGADO!");
        ligado = false;
    }

    public void atualizar(double version) {
        System.out.println("O computador está sendo ATUALIZADO!");
    }

    public String reiniciar() {
        return "O computador será REINICIADO";
    }

}
