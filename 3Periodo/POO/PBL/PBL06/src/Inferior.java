public class Inferior extends Roupa {
    private String tipoInferior;
    private String estiloInferior;

    public Inferior(String tamanho, String cor, String tipoTecido, boolean genero, boolean superior,
                    String tipoInferior, String estiloInferior) {
        super(tamanho, cor, tipoTecido, genero, superior);
        this.tipoInferior = tipoInferior;
        this.estiloInferior = estiloInferior;
    }

    public String getTipoInferior() {return this.tipoInferior;}
    public String getEstiloInferior() {return estiloInferior;}

    public void setTipoInferior(String tipoInferior) {this.tipoInferior = tipoInferior;}
    public void setEstiloInferior(String estiloInferior) {this.estiloInferior = estiloInferior;}

    public Inferior() {
        super(false);
    }
}
