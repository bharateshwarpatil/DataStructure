package com.datastructure.list.singlylist;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapPairs {

    static class ListNode {
        public int val;
        public ListNode next;
        AtomicInteger IAtomicInteger;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            if (next != null) {
                return val + "-->" + next.toString();
            }
            return val + "";
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode node6 = new ListNode(6);
        //node5.next = node6;
        System.out.println(swapPairs(node));
    }

    static public ListNode swapPairs(ListNode A) {
        if (A.next == null) return A;
        ListNode currentNode = A;
        ListNode returnNode = A.next;
        ListNode prevNode = null;

        while (currentNode !=null && currentNode.next != null) {
             ListNode nextNode=currentNode.next;
             currentNode.next=nextNode.next;
             nextNode.next=currentNode;
            if(prevNode!=null)prevNode.next=nextNode;
             prevNode=currentNode;
            currentNode=currentNode.next;

        }


        return returnNode;


    }


}
