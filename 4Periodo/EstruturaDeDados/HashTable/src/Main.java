public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Inserir valores na tabela hash
        hashTable.put(15);
        hashTable.put(25);
        hashTable.put(35);
        hashTable.put(10);
        hashTable.put(20);
        hashTable.put(30);

        // Imprimir a tabela hash
        hashTable.printTable();

        // Verificar se a tabela contém um valor
        System.out.println("Contém 25? " + hashTable.contains(25)); // true
        System.out.println("Contém 40? " + hashTable.contains(40)); // false

        // Remover um valor
        hashTable.remove(25);
        System.out.println("Após remover 25:");
        hashTable.printTable();

    }
}