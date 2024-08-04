import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ArrayList<List<String>> clientes = new ArrayList<>();
    static ArrayList<List<String>> funcionarios = new ArrayList<>();
    static ArrayList<List<String>> carros = new ArrayList<>();

    public static void main(String[] args) {

        Pessoa Adriano = new Cliente("Adrinano", "adriano@gmail.com", 2005, "123.456.789-10");
        Veiculo gol = new Veiculo("cinza", "Volkswagen", "Gol Rock in Rio", 2015, "Adriano", 4);
        cadastrarCliente(Adriano, clientes);
        cadastrarCarro(gol, carros);

        Pessoa Ary = new Cliente("Ary", "aryfarahs@gmail.com", 2005, "112.939.089-67");
        Veiculo newstyle = new Veiculo("branco", "Peugeot", "New Style", 2023, "Ary", 4);
        cadastrarCliente(Ary, clientes);
        cadastrarCarro(newstyle, carros);

        Pessoa Luiza = new Cliente("Luiza", "luizape@gmail.com", 2005, "109-876-543-21");
        Veiculo byd = new Veiculo("creme", "BYD", "Dolphin Mini", 2024, "Luiza", 4);
        cadastrarCliente(Luiza, clientes);
        cadastrarCarro(byd, carros);

        System.out.println("### BEM VINDO ###");

        Scanner s = new Scanner(System.in);
            System.out.print("1. Cadastrar novo usuario\n" +
                             "2. Cadastrar novo carro\n" +
                             "3. Contratar um serviço\n" +
                             "4. Visualizar clientes\n" +
                             "5. Visualizar carros");
            System.out.print("O que deseja fazer?");

            int choice = s.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Nome: ");
                    String name = s.nextLine();

                    System.out.print("E-mail: ");
                    String email = s.nextLine();

                    System.out.print("Ano de Nascimento: ");
                    int anoNasc = s.nextInt();

                    System.out.print("CPF: ");
                    String cpf = s.nextLine();

                    Pessoa pessoa = new Cliente(name, email, anoNasc, cpf);
                    cadastrarCliente(pessoa, clientes);

                case 2:
                    System.out.print("Modelo: ");
                    String modelo = s.nextLine();

                    System.out.print("Marca: ");
                    String marca = s.nextLine();

                    System.out.print("Ano: ");
                    int ano = s.nextInt();

                    System.out.print("Cor: ");
                    String cor = s.nextLine();

                    System.out.print("Nome do Dono: ");
                    String dono = s.nextLine();

                    System.out.print("Quantidade de rodas: ");
                    int rodas = s.nextInt();

                    Veiculo veiculo = new Veiculo(cor, marca, modelo, ano, dono, rodas);
                    cadastrarCarro(veiculo, carros);

                case 3:

                case 4:
                    Funcionario.imprimirDetalhesFuncionario(clientes);

            }


    }

    public static void cadastrarCliente(Pessoa a, ArrayList<List<String>> lista) {
        ArrayList<String> ass = new ArrayList<>();
        ass.add(a.getName());
        ass.add(a.getEmail());
        ass.add(a.getCpf());
        ass.add(String.valueOf(a.getAnoNasc()));
        lista.add(ass);
    }

    public static void cadastrarCarro(Veiculo v, ArrayList<List<String>> lista) {
        ArrayList<String> car = new ArrayList<>();
        car.add(v.getModelo());
        car.add(v.getMarca());
        car.add(v.getCor());
        car.add(String.valueOf(v.getAno()));
        car.add(String.valueOf(v.getQntRodas()));
        car.add(String.valueOf(v.getNomeDono()));
        lista.add(car);
    }

}