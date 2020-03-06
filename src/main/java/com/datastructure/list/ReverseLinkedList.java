package com.selfguide.datastructure.list;

public class ReverseLinkedList {

    // null --> 1--->2--->3--->4-->5
    /**
     *
     * @param node
     */
    public void reverseList(Node node) {
        Node curNode = node;
        Node prevNode = null;
        while (curNode.getNext() != null) {
            Node next = curNode.getNext();                 // 2                   4
            Node temp= next.getNext();                    // tmp = 3              5
            next.setNext(curNode);                       // 2-->1-->null          4--->3
            curNode.setNext(prevNode);                  //2-->1-->null  //        4--->3--->2-->1-->null
            prevNode=next;                           //prevNode=2;                4
            curNode=temp;                           //curr=3;                     5
        }
    }
}
