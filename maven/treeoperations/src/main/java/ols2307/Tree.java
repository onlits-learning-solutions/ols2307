package ols2307;

public class Tree<E> {
    Node<E> root;

    public int addNode(E data) {
        if (root == null) {
            root = new Node<>(data);
            return 0;
        }
        
        return 1;
    }

    public void preorder() {

    }
}
