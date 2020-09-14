package com.datastructure.queue;

import java.util.Comparator;

public class Node<T,W extends Comparable> implements Comparable<Node<T,W>> {

    private T key;
    private W weight;

    public Node(T key, W weight) {
        this.key = key;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node<T, W> o) {
        return weight.compareTo(o.getWeight());
    }


    public W getWeight() {
        return weight;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void setWeight(W weight) {
        this.weight = weight;
    }
}
