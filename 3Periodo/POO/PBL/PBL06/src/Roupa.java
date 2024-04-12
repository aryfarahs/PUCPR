public class Roupa {
    protected String tamanho;
    protected String cor;
    protected String tipoTecido;
    protected boolean genero;
    protected boolean superior;

    public Roupa(String tamanho, String cor, String tipoTecido, boolean genero, boolean superior) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.tipoTecido = tipoTecido;
        this.genero = genero;
        this.superior = superior;
    }

    public String getTamanho() {return this.tamanho;}
    public String getCor() {return cor;}
    public String getTipoTecido() {return tipoTecido;}
    public boolean isGenero() {return genero;}
    public boolean isSuperior() {return superior;}

    public void setTamanho(String tamanho) {this.tamanho = tamanho;}
    public void setCor(String cor) {this.cor = cor;}
    public void setTipoTecido(String tipoTecido) {this.tipoTecido = tipoTecido;}
    public void setGenero(boolean genero) {this.genero = genero;}
    public void setSuperior(boolean superior) {this.superior = superior;}

    public Roupa(boolean superior) {
        this.superior = superior;
    }

    public void comprar() {
        System.out.println("A peça veste a parte superior? " + superior);
    }
}
