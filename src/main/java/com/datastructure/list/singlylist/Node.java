package com.datastructure.list.singlylist;

public class Node<T extends  Comparable> {

    private Node next;

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public Node(Node next, T data) {
        this(data);
        this.next = next;

    }

    public Node getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return data != null ? data.equals(node.data) : node.data == null;
    }
    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Node{" +
                " data=" + data +
                '}';
    }
}
