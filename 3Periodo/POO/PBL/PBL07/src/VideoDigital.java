public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{
    private String descVD;

     public VideoDigital(String tituloLivro, String autorLivro, String descVD) {
         super(tituloLivro, autorLivro);
         this.descVD = descVD;
     }

    public void descricao() {
        System.out.println("Descrição " + tituloLivro + " - " + autorLivro + ": " + descVD);
    }

    @Override
    public void baixar() {
        System.out.println("Arquivo baixado com sucesso!");
    }

    @Override
    public void visualizar() {
        System.out.println("Visualização do arquivo disponível!");
    }
}
