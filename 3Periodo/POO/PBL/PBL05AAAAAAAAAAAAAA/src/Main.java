import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Menu menu1 = new Menu("Restaurante Guanabara", "Coca-Cola", 5.00F);

        Promotion promotion = new Promotion();
        Promotion promotion1 = new Promotion("Burger King", "Wooper", 0.20F);

        Establishment establishment = new Establishment();
        Establishment establishment1 = new Establishment("Angeloni", "Supermercado",
                "--", "Água Verde", true);

        Client client = new Client();
        Client client1 = new Client(1, "999.888.777-66", "Luiza Maria", "40987654321");

        Motoboy motoboy = new Motoboy();
        Motoboy motoboy1 = new Motoboy("Jean Paulinho", "102.394.586-77", "30931415161", "ABC1D34");


        System.out.println("--------- BEM-VINDO ---------");
        System.out.println("1. Cadastrar Usuário");
        System.out.println("2. Adicionar Produto");
        System.out.println("3. Mostrar Carrinho");
        System.out.println("0. Sair");

        Scanner scanner = new Scanner(System.in);
        System.out.print("O que deseja fazer? ");
        int choice = scanner.nextInt();
        scanner.close();

        if (choice == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            String newName = scanner1.nextLine();
            System.out.print("Digite seu CPF: ");
            String newCpf = scanner1.nextLine();
            scanner1.close();
            System.out.println(newName);
            System.out.println(newCpf);
        }

        if (choice == 2) {
            System.out.print("");

        }

        if (choice == 3) {
            System.out.print("");

        }

        if (choice == 0) {
            System.out.print("");

        }

        System.out.println();
        System.out.println("SEM PARÂMETROS");

        System.out.println();
        System.out.println("MENU");
        System.out.println("Nome do estabelecimento: " + menu.getEstablishmentName());
        System.out.println("Produto: " + menu.getProduct());
        System.out.println("Preço: " + menu.getPice());

        System.out.println();
        System.out.println("PROMOÇÕES");
        System.out.println("Nome do Estabelecimento: " + promotion.getEstablishmentName());
        System.out.println("Produto: " + promotion.getProduct());
        System.out.println("Porcentagem do Desconto: " + promotion.getValue());

        System.out.println();
        System.out.println("ESTABELECIMENTO");
        System.out.println("Nome: " + establishment.getName());
        System.out.println("Tipo: " + establishment.getKind());
        System.out.println("Categoria de Produtos: " + establishment.getProductCategory());
        System.out.println("Localização: " + establishment.getLocation());
        System.out.println("Existem Promoções? " + establishment.isPromotion());

        System.out.println();
        System.out.println("CLIENTE");
        System.out.println("Nome: " + client.getName());
        System.out.println("CPF: " + client.getCpf());
        System.out.println("Telenofe: " + client.getNumber());
        System.out.println("Quantidade de Restaurantes Favoritados: " + client.getFavoriteRestaurants());

        System.out.println();
        System.out.println("MOTOBOY");
        System.out.println("Nome: " + motoboy.getName());
        System.out.println("CPF: " + motoboy.getCpf());
        System.out.println("Telefone: " + motoboy.getNumber());

        System.out.println();
        System.out.println();
        System.out.println("COM PARÂMETROS");

        System.out.println();
        System.out.println("MENU");
        System.out.println("Nome do estabelecimento: " + menu1.getEstablishmentName());
        System.out.println("Produto: " + menu1.getProduct());
        System.out.println("Preço: " + menu1.getPice());

        System.out.println();
        System.out.println("PROMOÇÕES");
        System.out.println("Nome do Estabelecimento: " + promotion1.getEstablishmentName());
        System.out.println("Produto: " + promotion1.getProduct());
        System.out.println("Porcentagem do Desconto: " + promotion1.getValue());

        System.out.println();
        System.out.println("ESTABELECIMENTO");
        System.out.println("Nome: " + establishment1.getName());
        System.out.println("Tipo: " + establishment1.getKind());
        System.out.println("Categoria de Produtos: " + establishment1.getProductCategory());
        System.out.println("Localização: " + establishment1.getLocation());
        System.out.println("Existem Promoções? " + establishment1.isPromotion());

        System.out.println();
        System.out.println("CLIENTE");
        System.out.println("Nome: " + client1.getName());
        System.out.println("CPF: " + client1.getCpf());
        System.out.println("Telenofe: " + client1.getNumber());
        System.out.println("Quantidade de Restaurantes Favoritados: " + client1.getFavoriteRestaurants());

        System.out.println();
        System.out.println("MOTOBOY");
        System.out.println("Nome: " + motoboy1.getName());
        System.out.println("CPF: " + motoboy1.getCpf());
        System.out.println("Telefone: " + motoboy1.getNumber());

    }
}
