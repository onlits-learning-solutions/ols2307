package ols2307;

public class Node<E> {
    E data;
    Node<E> leftNode;
    Node<E> rightNode;

    Node() {
    }

    Node(E data) {
        this.data = data;
    }

    Node(E data, Node<E> leftNode, Node<E> rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
