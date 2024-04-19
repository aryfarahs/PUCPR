public class Ebook extends ItemBibliotecaDigital implements Baixavel {
    private String descE;

    public Ebook(String tituloLivro, String autorLivro, String descE) {
        super(tituloLivro, autorLivro);
        this.descE = descE;
    }

    public void descricao() {
        System.out.println("Descrição " + tituloLivro + " - " + autorLivro + ": " + descE);
    }

    @Override
    public void baixar() {
        System.out.println("Arquivo baixado com sucesso!");
    }
}
