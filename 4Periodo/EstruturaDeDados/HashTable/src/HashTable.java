public class HashTable {
    private int size = 10;
    private int valor;
    private List

    public HashTable(int size, int valor) {
        this.size = size;
        this.valor = valor;
    }

    public int funcaoHash(int valor) {
        int chave = valor / 100;
        System.out.println("Chave = " + valor + "x 0.1");
        return chave;
    }

    public void inserir(int chave) {
        table = table.ad(chave)
    }


}
