public class MorseTree {
    private Node root;

    public MorseTree() {
        this.root = new Node(" ");
    }

    public Node getRoot() {
        return root;
    }

    public void insert(String morse, String letter) {
        Node current = this.root;

        for (int i = 0; i < morse.length(); i++) {
            String c = morse.substring(i, i + 1);

            if (c.equals(".")) {
                if (current.getLeft() == null) {
                    current.setLeft(new Node(null));
                }
                current = current.getLeft();
            } else if (c.equals("-")) {
                if (current.getRight() == null) {
                    current.setRight(new Node(null));
                }
                current = current.getRight();
            }
        }

        current.setValue(letter);
    }

    public void translate(String morse) {
        String[] codeList = morse.split(" ");

        for (String code : codeList){
            Node current = this.root;

            for (int i = 0; i < code.length(); i++) {
                String c = code.substring(i, i + 1);

                if (c.equals(".")) {
                    current = current.getLeft();
                }
                else if (c.equals("-")) {
                    current = current.getRight();
                }
                else if (c.equals("/")) {
                    System.out.print("");
                }

            }

            String letter = current.getValue();
            System.out.print(letter);
        }
        System.out.println();
    }

}