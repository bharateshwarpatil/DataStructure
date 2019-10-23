package com.datastructure.list.singlylist;

import java.util.List;

public class DeleteDuplicates {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node.next = node2;

        ListNode node3 = new ListNode(1);
        node2.next = node3;

        ListNode node4 = new ListNode(2);
        node3.next = node4;

        ListNode node5 = new ListNode(2);
        node4.next = node5;

        ListNode node6 = new ListNode(4);
        node5.next = node6;




        System.out.println(deleteDuplicates(node));

    }

    static class ListNode {
        public int val;
        public ListNode next;

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

    static public ListNode deleteDuplicates(ListNode A) {
        if(A.next==null) return  A;
        ListNode PrevNode = null;
        ListNode returnNode = null;
        while (A != null) {
            if (A.next != null && A.val == A.next.val) {

                do{
                        A = A.next;
                }while ( A.next!=null && A.val == A.next.val);
                A=A.next;
                if(PrevNode!=null)PrevNode.next=null;
            } else {
                 if(PrevNode!=null){
                     PrevNode.next = A;
                 }
                PrevNode=A;
                 if(returnNode==null)  returnNode=A;
                A = A.next;
            }
        }
        return returnNode;
    }


}
