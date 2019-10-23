package com.datastructure.list.singlylist;

/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 *
 * For example:
 *
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */
public class RotateRight {

    public static void main(String[] args) {

        ListNode node =new ListNode(1);
        ListNode node2 =new ListNode(2);
        node.next=node2;

        ListNode node3 =new ListNode(3);
        node2.next=node3;

        ListNode node4 =new ListNode(4);
        node3.next=node4;

        ListNode node5 =new ListNode(5);
        node4.next=node5;

        ListNode node6 =new ListNode(6);
        node5.next=node6;


        System.out.println(rotateRight(node,90));

    }
    static  class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
        @Override
        public String toString() {
            if (next != null) {
                return val + "-," + next.toString();
            }
            return val + "";
        }
    }


    static public ListNode rotateRight(ListNode A, int B) {
        ListNode  fastptr = A;
        ListNode  slowptr = A;
        ListNode  headptr = A;
        int c=0;
        while(c < B){
            fastptr=fastptr.next;
            c++;
            if(fastptr==null){
                if(c <=1){
                    return A;
                }
                B = B % c;
                c=0;
                if(B==0){
                    return A;
                }
                fastptr=A;
            }

        }

        while(fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next;
        }
        ListNode node = slowptr.next;
        fastptr.next=headptr;
        slowptr.next=null;
        A=node;
        return A;
    }


}
