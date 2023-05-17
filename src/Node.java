public class Node<T> {
    T value;
    Node<T> leftChild;
    Node<T> rightChild;

    public Node(T value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean hasLeftChild(Node<T> root) {
        if(value instanceof Integer) {
            return root.leftChild == null;
        } else if(value instanceof Integer) {
            return root.leftChild == null;
        }
        return false;
    }

    public boolean hasRightChild(Node<T> root) {
        if(value instanceof Integer) {
            return root.rightChild == null;
        } else if(value instanceof Integer) {
            return root.rightChild == null;
        }
        return false;
    }

    public Node<T> getLeftChild() {
        return this.leftChild;
    }

    public Node<T> getRightChild() {
        return this.rightChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node = " + this.value;
    }
}
