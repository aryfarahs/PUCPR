public abstract class ItemBibliotecaDigital {
    protected String tituloLivro;
    protected String autorLivro;

    public ItemBibliotecaDigital(String tituloLivro, String autorLivro) {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
    }

    public abstract void descricao();
}
