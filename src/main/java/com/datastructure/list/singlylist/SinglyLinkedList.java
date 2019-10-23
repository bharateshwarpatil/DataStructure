package com.datastructure.list.singlylist;

public class SinglyLinkedList<T extends  Comparable> {

    private Node<T> headNode;

    /**
     * insert data
     *
     * @param data
     * @return
     */
    public boolean add(T data) {
        Node currNode = headNode;
        if (currNode != null) {
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(new Node(data));
        } else {
            headNode = new Node<T>(null, data);
        }
        return true;
    }

    /**
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
     * ### getNtheNode from the lastNode
     * Complexity=O(n)
     */
    public Node<T> getNthElementfromLast(int n) {
        if (headNode == null) return null;
        Node fastPointer = headNode;
        Node slowPointer = headNode;
        int currentCursor = 0;
        while (fastPointer.getNext() != null) {
            currentCursor++;
            if (currentCursor > n) {
                slowPointer = slowPointer.getNext();
            }
            fastPointer = fastPointer.getNext();
        }
        return slowPointer;
    }

    /**
     * reverse SinglyNode
     *
     * @param
     */
    public void reveseSinglyList() {
        Node currNode = headNode;
        Node prevNode = null;
        while (currNode != null) {
            Node nextNode = currNode.getNext();//
            Node tmpNode = nextNode.getNext();
            nextNode.setNext(currNode);
            currNode.setNext(prevNode);
            prevNode = nextNode;
            currNode = tmpNode;
        }
        headNode = prevNode;
    }



    /**
     * reverse SinglyNode
     *
     * @param
     */
    public T findMiddleOfList() {
        if(headNode==null) return null;
        Node<T> fastNode = headNode;
        Node<T> slowNode = headNode;
        while (fastNode.getNext() != null) {
            fastNode = fastNode.getNext();
            if (fastNode.getNext() == null) {
                System.out.println("length of the List is odd :)");
                return slowNode.getData();
            }
            fastNode = fastNode.getNext();
            slowNode = slowNode.getNext();
            System.out.println(slowNode);
        }
        System.out.println("length of the List is even :)");
        return slowNode.getData();
    }

    public void sort(){
        mergesort(headNode);
    }

    private Node mergesort(Node node){
        if(node.getNext()==null) return node;
        Node secondHalf=getMidNode(node);
        Node second=mergesort(secondHalf);//sort second half ;
        Node first=mergesort(node);//sort first half
        Node currnode =merge(second,first);
        headNode=currnode;
        return  currnode;
    }

    private Node merge(Node first,Node second){
        if(first ==null ) return  second;
        if(second ==null ) return  first;
         Node tmp=null;
        if(first.getData().compareTo(second.getData()) >0){
            second.setNext(merge(second.getNext(),first));
            tmp=second;
       }else {
            first.setNext(merge(first.getNext(),second));
            tmp=first;
        }
       return tmp;
    }

    private Node getMidNode(Node node) {
        Node fastNode=node;
        Node slowNode=node;
        while( fastNode.getNext()!=null){
            fastNode=  fastNode.getNext();
           if( fastNode.getNext()== null ) break;
            fastNode=  fastNode.getNext();
            slowNode= slowNode.getNext();
      }
      if(slowNode!=null){
          Node tmp= slowNode;
          slowNode=slowNode.getNext();
          tmp.setNext(null);
      }
      return  slowNode;
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

