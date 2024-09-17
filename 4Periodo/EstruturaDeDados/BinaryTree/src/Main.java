public class Main {
    public static void main(String[] args) {
        Tree<Integer> binaryTree = new Tree<Integer>();

        binaryTree.add(10);
        binaryTree.add(5);
        binaryTree.add(8);
        binaryTree.add(9);
        binaryTree.add(7);
        binaryTree.add(18);
        binaryTree.add(13);
        binaryTree.add(20);

        System.out.println("EM ORDEM");
        binaryTree.showOrdered(binaryTree.getRoot());

        System.out.println();
        System.out.println("\nPRÉ ORDEM");
        binaryTree.showPreOrdered(binaryTree.getRoot());

        System.out.println();
        System.out.println("\nPÓS ORDEM");
        binaryTree.showPosOrdered(binaryTree.getRoot());

    }
}
