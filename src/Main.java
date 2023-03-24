public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinaryTreePrint btp = new BinaryTreePrint();

        // test isEmpty() and makeEmpty()
        System.out.println("Is the tree empty? " + bst.isEmpty()); // should print "true"
        bst.addNode(5);
        bst.addNode(3);
        bst.addNode(5);
        System.out.println("Is the tree empty? " + bst.isEmpty()); // should print "false"

        System.out.println();
        bst.makeEmpty();
        System.out.println("Is the tree empty after makeEmpty()? " + bst.isEmpty()); // should print "true"

        // test addNode() and contains()
        bst.setRoot(new BinaryTreeNode<>(5));
        bst.addNode(4);
        bst.addNode(3);
        bst.addNode(1);
        bst.addNode(6);
        bst.addNode(7);
        bst.addNode(8);
        bst.addNode(7);
        System.out.println("Does the tree contain 4? " + bst.contains(4)); // should print "true"
        System.out.println("Does the tree contain 2? " + bst.contains(2)); // should print "false"

        new BinaryTreePrint().printTree(bst.getRoot());

        System.out.println();
        // test findMin() and findMax()
        System.out.println("The minimum value in the tree is: " + bst.findMin()); // should print "1"
        System.out.println("The maximum value in the tree is: " + bst.findMax()); // should print "8"


        // test deleteNode()
        bst.deleteNode(5);
        System.out.println("Does the tree contain 3 after deletion? " + bst.contains(5)); // should print "false"
        System.out.println();
        new BinaryTreePrint().printTree(bst.getRoot());
        bst.rebalance();
        System.out.println();
        new BinaryTreePrint().printTree(bst.getRoot());
    }
}