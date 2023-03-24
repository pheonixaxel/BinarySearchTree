public class BinarySearchTree<T extends Comparable<? super T>> {
    private BinaryTreeNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T itemToSearch, BinaryTreeNode<T> node) {
        if (node == null) {
            return false;
        }
        int compareResult = itemToSearch.compareTo(node.getElement());
        if (compareResult < 0) {
            return contains(itemToSearch, node.getLeftChild());
        } else if (compareResult > 0) {
            return contains(itemToSearch, node.getRightChild());
        } else {
            return true;
        }
    }
    public boolean contains(T x) {
        return contains(x, root);
    }

    

}

