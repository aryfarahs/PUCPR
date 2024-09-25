public class MorseTree {
    private Node root;

    public MorseTree() {
        this.root = new Node(" "); // Inicializa a raiz corretamente
    }

    public Node getRoot() {
        return root;
    }

    public void insert(String sequence, String value) {
        Node current = this.root;

        for (char c : sequence.toCharArray()) { // Itera sobre os caracteres da sequência Morse
            if (c == '.') {
                // Verifica se o nó da esquerda já existe
                if (current.getLeft() == null) {
                    current.setLeft(new Node(null)); // Cria novo nó se não existir
                }
                current = current.getLeft(); // Move para a esquerda
            } else if (c == '-') {
                // Verifica se o nó da direita já existe
                if (current.getRight() == null) {
                    current.setRight(new Node(null)); // Cria novo nó se não existir
                }
                current = current.getRight(); // Move para a direita
            }
        }

        // Ao final, insere o valor no nó final da sequência Morse
        current.setValue(value); // Apenas o nó final recebe o valor
    }

    public String translate([] ) {
        
    }
}