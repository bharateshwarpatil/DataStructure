package com.datastructure.tree;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DeleteTree {

    static void deleteTree(Node node) {
        if (node == null) return;
        deleteTree(node.leftNode);
        deleteTree(node.rightNode);
        node.setData(null);
        node.setLeftNode(null);
        node.setRightNode(null);
    }

    static Node deepestNode;

    static Node deepestNode(Node node, int height, AtomicInteger maxHeight) {
        if (node == null) return null;
        int nodeHeight = height + 1;
        deepestNode(node.leftNode, nodeHeight, maxHeight);
        deepestNode(node.rightNode, nodeHeight, maxHeight);
        if (maxHeight.get() < nodeHeight) {
            maxHeight.set(nodeHeight);
            deepestNode = node;
        }
        return deepestNode;
    }

    static void printPaths(Node node, List list) {
        if (node == null) return;
        list.add(node.data);
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            printData(list);
            return;
        }
        printPaths(node.getLeftNode(), list);
        printPaths(node.getRightNode(), list);
    }

    static void printZigZag(Node node, List list) {
        Queue queue = new LinkedList();
        queue.offer(node);
        queue.offer(null);

        LinkedList stack = new LinkedList();
        boolean zigzag = false;
        while (!queue.isEmpty()) {
            Node tmpNode = (Node) queue.remove();
            if (tmpNode == null) {
                while (zigzag && !stack.isEmpty()) {
                    list.add(stack.pop());
                }
                zigzag = !zigzag;
                if (!queue.isEmpty())
                    queue.offer(null);
                continue;
            } else {
                if (zigzag) {
                    stack.push(tmpNode);
                } else {
                    list.add(tmpNode);

                }
            }
            if (tmpNode.getLeftNode() != null) {
                queue.offer(tmpNode.getLeftNode());
            }
            if (tmpNode.getRightNode() != null) {
                queue.offer(tmpNode.getRightNode());
            }

        }
    }

    private static void printData(List list) {
        list.forEach(x -> System.out.println(x));
    }

    static void printNode(Node node) {
        if (node == null) return;
        printNode(node.leftNode);
        printNode(node.rightNode);
        System.out.println(node.getData());
    }


    public static void main(String[] args) {
        int a[] = new int[2];
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        Node<Integer> node = new Node(6, new Node(4, new Node(3, new Node(1, null, null), null), new Node(5, null, null)), new Node(7, null, null));
        List list = new ArrayList();
       // printZigZag(node, list);
       // System.out.println(list);
        // printPaths(node, new ArrayList());
        //System.out.println(deepestNode(node, 0, new AtomicInteger()));
        //System.out.println(deepestNode);
    }
}
