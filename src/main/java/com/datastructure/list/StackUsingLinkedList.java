package com.selfguide.datastructure.list;

public class StackUsingLinkedList<T extends Comparable> {

    Node<T> head;

    public void push(T data) {
        if (head == null) {
            this.head = new Node<T>(data);
            return;
        }
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    public T pop() {
        T data = head.getData();
        Node node = head.getNext();
        head.setNext(null); // gc
        head = node;
        return data;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public T Peek (){
        return isEmpty()?null:head.getData();
    }
}
