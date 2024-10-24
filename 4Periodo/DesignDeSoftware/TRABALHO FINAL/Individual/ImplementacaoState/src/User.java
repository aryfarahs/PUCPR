public class User {
    private EstadoUser estado;
    private String estadoChar;

    public User() {
        this.estado = new Online();
    }

    public void setEstado(EstadoUser estado) {
        this.estado = estado;
    }

    public void mudarEstado(int estado) {
        this.estado.estado(this, estado);
    }

    public String getEstado() {
        return estadoChar;
    }

    public void setEstado(String estadoChar) {
        this.estadoChar = estadoChar;
    }

}
