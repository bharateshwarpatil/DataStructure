package com.datastructure.list.singlylist;



public class RemoveNthfromtheNode {


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
        System.out.println(getNthFromEnd(node, 5));
       Integer [] a={ 18 , 595 , 253 , 7 , 984 , 914 , 903 , 992 , 522 , 784 , 55 , 910 , 123 , 133 , 936 , 38 , 774 , 868 , 204 , 727 , 927 , 981 , 766 , 619 , 848 , 398 , 782 , 460 , 444 , 805 , 62 , 154 , 35 , 261 , 202 , 622 , 472 , 151 , 590 , 270 , 115 , 773 , 332 , 928 , 298 , 597 , 150 , 704 , 229 , 205 , 501 , 284 , 497 , 305 , 864 , 368 , 995 , 731 , 255 , 712 , 614 , 179 , 756 , 432 , 415 , 734 , 449 , 85 , 817 , 686 , 829 , 12 , 564 , 427 , 711 , 275 , 109 , 641 , 344 , 934 , 760 , 551 , 958 , 540 , 446 };
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
                return val + "-," + next.toString();
            }
            return val + "";
        }
    }

    static public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode fast = A;
        ListNode slow = A;
        ListNode prev = A;


        int cnt = 1;

        int slowcnt = 1;
        while (fast != null) {
            int tmp = B;
            while (tmp > 0) {
                fast = fast.next;
                if (fast == null) break;
                tmp--;
                cnt++;
            }

               if(fast!=null || slowcnt <= cnt-B){
                   prev = slow;
                   slow = slow.next;
                   slowcnt++;
               }

           }
        if (cnt - B == 0) {
            return A.next;
        } else if (cnt < B) {
            return A;
        } else {
            prev.next = slow.next;
        }


        return A;
    }



    static public ListNode getNthFromEnd(ListNode A, int B) {
        ListNode fast = A;
        ListNode slow = A;
        ListNode prev = A;


        int cnt = 1;

        int slowcnt = 1;
        while (fast != null) {
            int tmp = B;
            while (tmp > 0) {
                fast = fast.next;
                if (fast == null) break;
                tmp--;
                cnt++;
            }

            if(fast!=null || slowcnt <= cnt-B){
                prev = slow;
                slow = slow.next;
                slowcnt++;
            }

        }
        return slow;
    }

}
