public class Veiculo {
    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private String nomeDono;
    private int qntRodas;

    public Veiculo(String cor, String marca, String modelo, int ano, String nomeDono, int qntRodas) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
