package com.datastructure.list;

import org.junit.Assert;
import org.junit.Test;

public class TestSinglyLinkedList {

    /**
     * for test with even length
     */
    @Test
    public void TestgetNthElementfromLast() {
        SinglyLinkedList<Integer> list = createEvenSinglyLinkedList();
        Assert.assertTrue(list.getNthElementfromLast(3).getData().equals(7));
        Assert.assertEquals(7l,(long)(list.getNthElementfromLast(3).getData()));
        Assert.assertEquals(2l,(long)(list.getNthElementfromLast(8).getData()));
        list.remove(new Node(10));
        Assert.assertEquals(7l,(long)(list.getNthElementfromLast(2).getData()));
        Assert.assertEquals(1l,(long)(list.getNthElementfromLast(8).getData()));
    }


    /**
     * for test with odd length
     */
    private SinglyLinkedList<Integer> createEvenSinglyLinkedList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }

}
