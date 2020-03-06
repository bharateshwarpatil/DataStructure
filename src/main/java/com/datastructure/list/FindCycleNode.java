package com.selfguide.datastructure.list;

public class FindCycleNode {
    /**
     * @param node
     * @return
     */
    public boolean findCycleInNode(Node node) {
        Node fastNode = node;
        Node slowNode = node;
        int cnt = 0;
        while (fastNode != null && fastNode != slowNode) {
            fastNode = fastNode.getNext();
            if (cnt % 2 == 0) {
                slowNode = slowNode.getNext();
            }
            cnt++;
        }
        return fastNode == slowNode;
    }
}
