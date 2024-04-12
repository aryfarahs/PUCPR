public class Superior extends Roupa {
    private String tipoSuperior;
    private String estiloSuperior;
    private String comprimentoManga;

    public Superior(String tamanho, String cor, String tipoTecido, boolean genero, boolean superior,
                    String tipoSuperior, String estiloSuperior, String comprimentoManga) {
        super(tamanho, cor, tipoTecido, genero, superior);
        this.tipoSuperior = tipoSuperior;
        this.estiloSuperior = estiloSuperior;
        this.comprimentoManga = comprimentoManga;
    }

    public String getTipoSuperior() {return this.tipoSuperior;}
    public String getEstiloSuperior() {return this.estiloSuperior;}
    public String getComprimentoManga() {return this.comprimentoManga;}

    public void setTipoSuperior(String tipoSuperior) {this.tipoSuperior = tipoSuperior;}
    public void setEstiloSuperior(String estiloSuperior) {this.estiloSuperior = estiloSuperior;}
    public void setComprimentoManga(String comprimentoManga) {this.comprimentoManga = comprimentoManga;}

    public Superior() {
        super(true);
    }
}
