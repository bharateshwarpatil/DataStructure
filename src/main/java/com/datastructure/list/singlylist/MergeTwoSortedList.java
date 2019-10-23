package com.datastructure.list.singlylist;

public class MergeTwoSortedList {
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
        ListNode node4 =new ListNode(4);
        node3.next=node4;
        System.out.println(mergeTwoListsIter(node,node3));
    }

   static  public ListNode mergeTwoLists(ListNode A, ListNode B){
    ListNode returnNode=null;
         if(A==null){
        return B;
    }
         if(B==null){
        return A;
    }
         if(A.val < B.val){
        A.next=mergeTwoLists(A.next,B);
        returnNode=A;
    }else{
        B.next=mergeTwoLists(A,B.next);
        returnNode=B;
    }

    return returnNode;
   }


    static  public ListNode mergeTwoListsIter(ListNode A, ListNode B){
        ListNode returnNode=null;
        ListNode prevNode=null;
       while(A!=null &&  B!=null){
             if(A.val < B.val){
                 if(prevNode==null){
                     prevNode=A;
                 }else {
                     prevNode.next=A;
                     prevNode= prevNode.next;
                 }
                 A=A.next;
             }else{
                 if(prevNode==null){
                     prevNode=B;
                 }else {
                     prevNode.next=B;
                     prevNode= prevNode.next;
                 }
                 B=B.next;
             }
           if(returnNode==null){
               returnNode=prevNode;
           }
       }
        if(A==null){
            while (B!=null){
                prevNode.next=B;
                prevNode= prevNode.next;
                B=B.next;
            }
        }
        if(B==null){
            while (A!=null){
                prevNode.next=A;
                prevNode= prevNode.next;
                A=A.next;
            }
        }
        return returnNode;
    }

}
