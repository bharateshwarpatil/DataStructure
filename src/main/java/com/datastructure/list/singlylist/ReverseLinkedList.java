package com.datastructure.list.singlylist;

public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode node = getListNode();

        System.out.println(reverse(node));
       // System.out.println(reverseRecursively(getListNode()));

    }

    private static ListNode getListNode() {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode node5 = new ListNode(5);
        node4.next = node5;
        return node;
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
                return val + "-->" +next.toString();
            }
            return val + "";
        }

        public String printtoString() {
            if (next != null) {
                return val + "-->" +next.toString();
            }
            return val + "";
        }
    }


    static public ListNode reverse(ListNode node) {
        if ( node.next == null) return node;
        ListNode returnNode = reverse(node.next);
        ListNode next = node.next;
        next.next = node;
        node.next = null;
        return returnNode;
    }

    static public ListNode reverseRecursively(ListNode node) {
        ListNode newHead;
        if ((node.next == null)) {
            return node;
        }
        newHead = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }


}
//8603 08060003
