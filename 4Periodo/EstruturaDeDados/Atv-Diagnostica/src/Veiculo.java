public abstract class Veiculo {
    private String cor;
    private String marca;
    private Cliente nomeDono;
    private int qntRodas;

    public Veiculo(String cor, String marca, Cliente nomeDono, int qntRodas) {
        this.cor = cor;
        this.marca = marca;
        this.nomeDono = nomeDono;
        this.qntRodas = qntRodas;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public int getQntRodas() {
        return qntRodas;
    }

    public String getNomeDono() {
        return nomeDono;
    }
}
