import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T>{

    public BinarySearchTree() {
        super();
    }
    public void addNode(T x) {
        root = addNode(x, root);
    }
    public void deleteNode(T x)
    {
        root = deleteNode(x, root);
    }
    public T findMin() {
        return findMin(root).getElement();
    }
    public T findMax() {
        return findMax(root);
    }
    public boolean contains(T x) {
        return contains(x, root);
    }

    public void rebalance() {
        ArrayList<T> list = inOrder();
        root = null;
        rebalance(list, 0, list.size() - 1);
    }

    private void rebalance(ArrayList<T> list, int i, int i1) {
        if (i > i1) {
            return;
        }
        int mid = (i + i1) / 2;
        addNode(list.get(mid));
        rebalance(list, i, mid - 1);
        rebalance(list, mid + 1, i1);
    }


    private BinaryTreeNode<T> addNode(T itemToAdd, BinaryTreeNode<T> node) {
        if (node == null) {
            return new BinaryTreeNode<T>(itemToAdd, null, null);
        }
        int compareResult = itemToAdd.compareTo(node.getElement());
        if (compareResult < 0) {
            node.setLeftChild(addNode(itemToAdd, node.getLeftChild()));
        } else {
            node.setRightChild(addNode(itemToAdd, node.getRightChild()));
        }
        return node;
    }
    private BinaryTreeNode<T> deleteNode(T itemToDelete, BinaryTreeNode<T> node) {
        if (node == null) {
            return node; // no item to delete
        }

        int compareResult = itemToDelete.compareTo(node.getElement());
        if (compareResult < 0) {
            node.setLeftChild(deleteNode(itemToDelete, node.getLeftChild()));
        } else if (compareResult > 0) {
            node.setRightChild(deleteNode(itemToDelete, node.getRightChild()));

        } else if (node.getLeftChild() != null && node.getRightChild() != null) // To children
        {
            node.element = findMin(node.rightChild).element;
            node.rightChild = deleteNode(node.element, node.rightChild);

        } else
        {
            node = (node.getLeftChild() != null) ? node.getLeftChild() : node.getRightChild();
        }

        return node;
    }
    public T findMax(BinaryTreeNode<T> node) {
        if (isEmpty()) {
            return null;
        }

        while (node.getRightChild() != null) {
            node = node.getRightChild();
        }
        return node.getElement();
    }

    public BinaryTreeNode<T> findMin(BinaryTreeNode<T> node) {
        if (node == null) {
            return null;
        } else if (node.getLeftChild() == null) {
            return node;
        } else {
            return findMin(node.getLeftChild());
        }
    }

    private boolean contains(T itemToSearch, BinaryTreeNode<T> node) {
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
}

