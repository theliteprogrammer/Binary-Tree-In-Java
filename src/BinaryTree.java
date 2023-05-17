public class BinaryTree<T> {
    private Node<T> root = null;

    public Node<T> getRoot() {
        return root;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        // check if there is a root node
        if(root == null) {
            this.root = newNode;
            return;
        } else {
            var current = this.root;
            while(true) {
                if(value instanceof Integer) {
                    if((int) value < (int) current.getValue()) {
                        if(current.leftChild == null) {
                            current.leftChild = newNode;
                            break;
                        }
                        current = current.leftChild;
                    } else if((int) value > (int) current.getValue()) {
                        if(current.rightChild == null) {
                            current.rightChild = newNode;
                            break;
                        }
                        current = current.rightChild;
                    }
                } else if(value instanceof Double) {
                    if((double) value < (double) current.getValue()) {
                        if(current.leftChild == null) {
                            current.leftChild = newNode;
                            break;
                        }
                        current = current.leftChild;
                    } else if((double) value > (double) current.getValue()) {
                        if(current.rightChild == null) {
                            current.rightChild = newNode;
                            break;
                        }
                        current = current.rightChild;
                    }
                } else if(value instanceof Float) {
                    if((float) value < (float) current.getValue()) {
                        if(current.leftChild == null) {
                            current.leftChild = newNode;
                            break;
                        }
                        current = current.leftChild;
                    } else if((float) value > (float) current.getValue()) {
                        if(current.rightChild == null) {
                            current.rightChild = newNode;
                            break;
                        }
                        current = current.rightChild;
                    }
                }
            }
        }
    }

    public boolean find(T value) {
        var current = this.root;
        while(current != null) {
            if(value instanceof Integer) {
                if((int) value < (int)(current.getValue())) {
                    current = current.leftChild;
                } else if((int) value > (int) (current.getValue())) {
                    current = current.rightChild;
                } else {
                    return true;
                }
            } else if(value instanceof Double) {
                if((double) value < (double)(current.getValue())) {
                    current = current.leftChild;
                } else if((double) value > (double) (current.getValue())) {
                    current = current.rightChild;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public void preOrderTraversal(Node<T> root) {
        // root, left, right
        if(root == null) {
            return;
        }
        System.out.print(root.value + "->");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void inOrderTraversal(Node<T> root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.leftChild);
        System.out.print(root.getValue() + "->");
        inOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal(Node<T> root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.getValue() + "->");
    }
}
