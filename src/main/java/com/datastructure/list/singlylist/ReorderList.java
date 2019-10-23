package com.datastructure.list.singlylist;

/**
 * Given a singly linked list
 *
 *     L: L0 → L1 → … → Ln-1 → Ln,
 * reorder it to:
 *
 *     L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 * You must do this in-place without altering the nodes’ values.
 *
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
public class ReorderList {


    static  class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }

        @Override
        public String toString() {
            if(next!=null){
                return val+"-->"+next.toString();
            }
            return  val+"";
        }
    }
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
        System.out.println(reorderList(node));
    }

     static public ListNode reorderList(ListNode A) {

     ListNode fastPointer=A;
     ListNode slowPointer=A;
     ListNode headPointer=A;
     ListNode secondheadPointer=A;
     ListNode prevPointer=null;

         int cnt=0;
      while(fastPointer!=null){
          fastPointer=fastPointer.next;
          if(fastPointer==null) break;
          fastPointer=fastPointer.next;
          prevPointer=slowPointer;
          slowPointer=slowPointer.next;
          cnt++;
      }
         ListNode curPointer=prevPointer.next;
         prevPointer.next=null;
          prevPointer=null;
         secondheadPointer=curPointer;

       while (curPointer!=null){
           ListNode next=curPointer.next;
           curPointer.next=prevPointer;
           prevPointer=curPointer;
           curPointer=next;
     }
         secondheadPointer=prevPointer;
         ListNode headNext =null;
         while (secondheadPointer!=null && headPointer!=null){
          headNext = headPointer.next;
         ListNode secheadNext = secondheadPointer.next;
         secondheadPointer.next=null;
         headPointer.next=secondheadPointer;
          secondheadPointer.next=headNext;
          headPointer=headNext;
          if(headPointer==null && secondheadPointer !=null ) {
              secondheadPointer.next=secheadNext;
          }else{
              secondheadPointer=secheadNext;

          }
      }
         return  A;
    }


}
