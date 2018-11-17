package com.datastructure.list.singlylist.com.datastructure.singlylist;

public class SinglyLinkedList<T> {

    private Node<T> headNode;

    /**
     * insert data
     * @param data
     * @return
     */
    public boolean add(T data) {
        Node currNode = headNode;
        if (currNode != null) {
            while (currNode.getNext() != null) {
                currNode=currNode.getNext();
            }
            currNode.setNext(new Node(data));
        } else {
            headNode = new Node<>(null, data);
        }
        return true;
    }

    /**
     *
     *
     * if node exist and it is deleted then return true otherwise it will be false
     *
     * @param node
     * @return
     */

    public boolean remove(Node node) {
        Node currNode = headNode;
        if (currNode != null) {
            if (currNode.equals(node)) {
                headNode = headNode.getNext();
                return true;
            }
            while (currNode.getNext() != null) {
                if (currNode.getNext().equals(node)) {
                    currNode.setNext(currNode.getNext().getNext());
                    return true;
                }
                currNode = currNode.getNext();
            }
        }
        return false;
    }

    /**
     * this for the problem solving purpose
     *### getNtheNode from the lastNode
     * Complexity=O(n)
     */
    public Node<T> getNthElementfromLast(int  n){
     if(headNode==null) return null;
      Node fastPointer=headNode;
      Node slowPointer=headNode;
      int currentCursor=0;
        while(fastPointer.getNext()!=null){
           currentCursor++;
           if(currentCursor >n){
               slowPointer=slowPointer.getNext();
           }
           fastPointer=fastPointer.getNext();
        }
    return slowPointer;
   }



   public  void  printNode(){
        Node tmp=headNode;
        if(tmp==null) return ;
        while (tmp!=null){
            System.out.println(tmp);
            tmp=tmp.getNext();
       }
   }
}

