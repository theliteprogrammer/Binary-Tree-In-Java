public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.print("Pre Order: ");
        tree.preOrderTraversal(tree.getRoot());
        System.out.println();
        System.out.print("In Order: ");
        tree.inOrderTraversal(tree.getRoot());
        System.out.println();
        System.out.print("In Order: ");
        tree.postOrderTraversal(tree.getRoot());
        System.out.println();
    }
}