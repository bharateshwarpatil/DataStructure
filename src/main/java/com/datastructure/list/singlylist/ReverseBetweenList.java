package com.datastructure.list.singlylist;



/**
 *
 *
 *
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *
 * return 1->4->3->2->5->NULL.
 */
public class ReverseBetweenList {

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
        System.out.println(reverseBetween(node,1,6));
    }

 static  public ListNode reverseBetween(ListNode A, int B, int C) {
       if(A.next==null ) return A;
       ListNode headNode=null;
       ListNode currentNode=A;
       ListNode previousNode=null;
       ListNode firstPartNode=null;
       ListNode secondPartNode=null;
       int count=1;
        while(count < B){
            previousNode=currentNode;
            currentNode= currentNode.next;
            headNode=previousNode;

            if(firstPartNode==null)firstPartNode=headNode;
            count++;
        }
           previousNode=null;
           ListNode nextNode=null;

         while(count <=C ){
             nextNode= currentNode.next;
             currentNode.next=previousNode;
             previousNode=currentNode;
             currentNode=nextNode;
             if(headNode!=null){
                 headNode.next=previousNode;
             }
            count++;
        }

        if(headNode==null) headNode=previousNode;
    // previousNode.next=currentNode;
//     if(headNode==null) headNode=firstPartNode;
     secondPartNode=headNode;
     while (secondPartNode.next!=null){
         secondPartNode=secondPartNode.next;
     }
     secondPartNode.next=currentNode;
     /* if(currentNode!=null){
          while(previousNode.next!=null){
              previousNode=previousNode.next;
          }
          previousNode.next=currentNode;

      }
*/
     if(firstPartNode!=null) return firstPartNode;
        return headNode;

    }
}
