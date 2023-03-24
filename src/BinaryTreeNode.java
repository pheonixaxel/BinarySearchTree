public class BinaryTreeNode<T> {

    T element;
    BinaryTreeNode<T> leftChild;
    BinaryTreeNode<T> rightChild;

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
    public void setElement(T element) {
        this.element = element;
    }
    public BinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setLeftChild(BinaryTreeNode<T> binaryTreeNode) {
        this.leftChild = binaryTreeNode;
    }
    public void setRightChild(BinaryTreeNode<T> binaryTreeNode) {
        this.rightChild = binaryTreeNode;
    }
}
