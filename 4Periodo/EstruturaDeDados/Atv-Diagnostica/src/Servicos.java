public abstract class Servicos {
    private int tempoEspera;
    private int preco;
    private Funcionario responsavel;
    private Cliente pagante;

    public Servicos(int tempoEspera, int preco, Funcionario responsavel, Cliente pagante) {
        this.tempoEspera = tempoEspera;
        this.preco = preco;
        this.responsavel = responsavel;
        this.pagante = pagante;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public int getPreco() {
        return preco;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public Cliente getPagante() {
        return pagante;
    }
}
