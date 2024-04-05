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


    }
}
