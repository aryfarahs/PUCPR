public class Main {
    public static void main(String[] args) {
        Tree<Integer> binaryTree = new Tree<Integer>();

        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(10);
        binaryTree.add(18);
        binaryTree.add(20);

        System.out.println("Imprimindo Árvore Em-Ordem");
        binaryTree.showOrdered(binaryTree.getRoot());

//        System.out.println();
//        System.out.println("\nPRÉ ORDEM");
//        binaryTree.showPreOrdered(binaryTree.getRoot());
//
//        System.out.println();
//        System.out.println("\nPÓS ORDEM");
//        binaryTree.showPosOrdered(binaryTree.getRoot());

        binaryTree.rmv(5);
        System.out.println();
        System.out.println("\nRemovendo o 5...");
        binaryTree.showOrdered(binaryTree.getRoot());

        binaryTree.rmv(7);
        System.out.println();
        System.out.println("\nRemovendo o 7...");
        binaryTree.showOrdered(binaryTree.getRoot());

        binaryTree.rmv(10);
        System.out.println();
        System.out.println("\nRemovendo o 10...");
        binaryTree.showOrdered(binaryTree.getRoot());

        binaryTree.rmv(20);
        System.out.println();
        System.out.println("\nRemovendo o 20...");
        binaryTree.showOrdered(binaryTree.getRoot());

    }
}
