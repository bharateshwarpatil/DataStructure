package com.selfguide.datastructure.list;

/**
 * Find N the node from the End of the linked list
 */
public class FindNthNodeLinkedList {


    public Node getNthNode(int n,Node node){
      Node fastNode= node;
      Node slowNode= null;
          int temp =n;
          int length=0;
          while (temp > 0 && fastNode!=null){
              fastNode=fastNode.getNext();
              length++;
              temp--;
             if(length>=n){
                 slowNode=slowNode==null?node:slowNode.getNext();
             }
          }
        return  slowNode;
    }
}
