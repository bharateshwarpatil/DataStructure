package com.datastructure.list.singlylist;


public class CirculerLinkedList {

    int size = -1;
    Node headeNode = null;

    public CirculerLinkedList(int size) {
        this.size = size;
    }

    //0-0-0-0-0-0
    public boolean add(Integer data) {
        if (headeNode != null) {
            Node temp = headeNode;
            int tempsize = 0;
            while (tempsize < size) {
                tempsize++;
                if (temp.getNext() == headeNode) {
                    Node<Integer> newNode = new Node<Integer>(data);
                    temp.setNext(newNode);
                    newNode.setNext(headeNode);
                    return true;
                }
                temp=temp.getNext();
            }
        }else {
            headeNode=new Node(data);
            headeNode.setNext(headeNode);
        }
        return false;
    }

}


