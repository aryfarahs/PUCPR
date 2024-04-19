public class Main {
    public static void main(String[] args) {

    ItemBibliotecaDigital ebook = new Ebook("Bridge to Terabithia", "Katherine Paterson", "ah pinto");
    ItemBibliotecaDigital ebook2 = new Ebook("Harry Potter e a Pedra Filosofal", "JK Rowling", "pzpzpz");

    ItemBibliotecaDigital vd = new VideoDigital("Em Busca da Casa Automática", "Vinicius13", "Série da boa");
    ItemBibliotecaDigital vd2 = new VideoDigital("Sem criatividade", "Ary Farah", "Melhor filme da história");

    ebook.descricao();
    ebook2.descricao();

    vd.descricao();
    vd2.descricao();

    }
}