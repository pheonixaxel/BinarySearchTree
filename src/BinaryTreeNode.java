public class BinaryTreeNode<T> {

    private T element;
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T element) {
        this.element = element;
        this.leftChild = null;
        this.rightChild = null;
    }

    public BinaryTreeNode(T element, BinaryTreeNode<T> leftChild, BinaryTreeNode<T> rightChild) {
        this.element = element;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getElement() {
        return element;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setLeftChild(BinaryTreeNode binaryTreeNode) {
        this.leftChild = binaryTreeNode;
    }
    public void setRightChild(BinaryTreeNode binaryTreeNode) {
        this.rightChild = binaryTreeNode;
    }
}
