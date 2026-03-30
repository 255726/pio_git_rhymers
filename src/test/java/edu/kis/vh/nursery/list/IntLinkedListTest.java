package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        list.push(5);
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(5, list.top());
    }
}