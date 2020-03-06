package com.selfguide.datastructure.list;

public class SinglyListInterSect {

    /***
     *
     *  1-->2-->3
     *            -->4 --->5 -->6 -->7
     *     8--> 9
     *
     * @param node
     * @param node2
     */
    public Node findInterSect(Node node, Node node2) {
        int heightFirst = 0;
        int heightSecond = 0;
        Node temp1 = node;
        Node temp2 = node2;
        while (node.getNext() != null) {
            node = node.getNext();
            heightFirst++;
        }
        while (node2.getNext() != null) {
            node2 = node2.getNext();
            heightSecond++;
        }
        int totalDiff = 0;
        if (heightFirst >= heightSecond) {
            totalDiff = heightFirst - heightSecond;
        } else {
            totalDiff = heightSecond - heightFirst;
            Node tm = temp1;
            temp1 = temp2;
            temp2 = tm;
        }

            int cnt = totalDiff;
            while (cnt > 0 && temp1 != null) {
                temp1 = temp1.getNext();
                cnt--;
            }
            while ( temp1!=null && temp2 != null) {
                temp2 = temp2.getNext();
                temp1 = temp1.getNext();
                if(temp1== temp2) return temp1;
            }


            return null;

    }
}
