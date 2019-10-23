package com.datastructure.list.singlylist;

import java.util.LinkedList;
import java.util.List;


public class PalindromeList {
    public static void main(String[] args) {

        ListNode node =new ListNode(1);
        ListNode node2 =new ListNode(2);
         node.next=node2;

        ListNode node3 =new ListNode(3);
        node2.next=node3;

        ListNode node4 =new ListNode(2);
        node3.next=node4;

        ListNode node5 =new ListNode(1);
        node4.next=node5;

        System.out.println(lPalin(node));

    }
   static  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

  static  public int lPalin(ListNode A) {
        ListNode fast=A;
        ListNode slow=A;
        java.util.LinkedList<Integer> stack= new  java.util.LinkedList<Integer>();
        stack.push(slow.val);
      while(fast.next!=null){
            fast=fast.next;
            if(fast.next==null){
                break;
            }
            fast=fast.next;
            slow=slow.next;
            if(fast.next!=null)stack.push(slow.val);
        }

    while ( !stack.isEmpty()){
        slow=slow.next;
        if(slow==null) return 0;
        if (stack.pop().intValue() != slow.val ){
            return 0;
        }
    }
        return 1;

    }




}
