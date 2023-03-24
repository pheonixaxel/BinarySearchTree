public class Main {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode(1);
        root.setLeftChild(new BinaryTreeNode(2));
        root.setRightChild(new BinaryTreeNode(3));
        root.getLeftChild().setLeftChild(new BinaryTreeNode(4));
        root.getLeftChild().setRightChild(new BinaryTreeNode(5));
        root.getRightChild().setLeftChild(new BinaryTreeNode(6));
        root.getRightChild().setRightChild(new BinaryTreeNode(7));
        BinaryTreePrint btp = new BinaryTreePrint();
        btp.printTree(root);

    }
}