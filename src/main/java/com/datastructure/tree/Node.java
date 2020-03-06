package com.datastructure.tree;



public class Node<T> {

    T data;
    Node <T> leftNode;
    Node <T> rightNode;

    public Node(T data, Node<T> leftNode, Node<T> rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +

                '}';
    }
}
