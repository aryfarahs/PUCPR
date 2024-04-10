public class Roupa {
    private String tamanho;
    private String cor;
    private String tipoTecido;
    private boolean genero;
    private boolean superior;

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
}
