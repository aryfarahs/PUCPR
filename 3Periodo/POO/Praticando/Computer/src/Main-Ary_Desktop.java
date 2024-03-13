public class Main {
    public static void main(String[] args) {
        computer desktop = new computer();
        desktop.marca = "Dell";
        desktop.cor = "Preto";
        desktop.ano = 2023;
        desktop.modelo = "Alpha";
        desktop.qtdeMemoria = 32f;
        desktop.tipo = 'D';

        System.out.println(desktop.marca)
        System.out.println(desktop.cor)
        System.out.println(desktop.ano)
        System.out.println(desktop.modelo)
        System.out.println(desktop.qtdeMemoria)
        System.out.println(desktop.tipo)


        computer notebook = new computer();
        notebook.marca = "Positivo";
        notebook.modelo = "Beta";
        notebook.cor = "Laranja";
        notebook.ano = 2016;
        notebook.qtdeMemoria = 8f;
        notebook.tipo = 'N';

        notebook.ligar();
        notebook.atualizar(10.9)
        System.out.println(notebook.reiniciar())
    }
}
