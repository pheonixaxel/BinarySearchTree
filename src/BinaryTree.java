import java.util.ArrayList;

public class BinaryTree<T extends Comparable<? super T>> {

    protected BinaryTreeNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public void setRoot(BinaryTreeNode<T> root) {
        this.root = root;
    }
    public BinaryTreeNode<T> getRoot() {
        return root;
    }
    public void makeEmpty() {
        root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public int size(){
        return size(root);
    }
    public int height() {
        return height(root);
    }

    public ArrayList<T> inOrder() {
        ArrayList<T> list = new ArrayList<T>();
        inOrder(root, list);
        return list;
    }
    public ArrayList<T> preOrder() {
        ArrayList<T> list = new ArrayList<T>();
        preOrder(root, list);
        return list;
    }
    public ArrayList<T> postOrder() {
        ArrayList<T> list = new ArrayList<T>();
        postOrder(root, list);
        return list;
    }
    public ArrayList<T> levelOrder() {
        ArrayList<T> list = new ArrayList<T>();
        levelOrder(root, list);
        return list;
    }

    private void levelOrder(BinaryTreeNode<T> root, ArrayList<T> list) {
        ArrayList<BinaryTreeNode<T>> queue = new ArrayList<BinaryTreeNode<T>>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<T> node = queue.remove(0);
            list.add(node.getElement());
            if (node.getLeftChild() != null) {
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.add(node.getRightChild());
            }
        }
    }

    private void postOrder(BinaryTreeNode<T> root, ArrayList<T> list) {
        if (root != null) {
            postOrder(root.getLeftChild(), list);
            postOrder(root.getRightChild(), list);
            list.add(root.getElement());
        }
    }


    private void preOrder(BinaryTreeNode<T> root, ArrayList<T> list) {
        if (root != null) {
            list.add(root.getElement());
            preOrder(root.getLeftChild(), list);
            preOrder(root.getRightChild(), list);
        }
    }

    private void inOrder(BinaryTreeNode<T> root, ArrayList<T> list) {
        if (root != null) {
            inOrder(root.getLeftChild(), list);
            list.add(root.getElement());
            inOrder(root.getRightChild(), list);
        }
    }


    private int size(BinaryTreeNode<T> node) {
        if (node == null) {
            return 0;
        } else {
            return size(node.getLeftChild()) + 1 + size(node.getRightChild());
        }
    }
    private int height(BinaryTreeNode<T> node) {
        if (node == null) {
            return -1;
        } else {
            return 1 + Math.max(height(node.getLeftChild()), height(node.getRightChild()));
        }
    }
}
