package org.leetcode.easy.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfLinkedList876Test {

    MiddleOfLinkedList876 sut = new MiddleOfLinkedList876();

    @Test
    public void oddNumberReturnsMiddleNode(){
        MiddleOfLinkedList876.ListNode node5 = new MiddleOfLinkedList876.ListNode(5);
        MiddleOfLinkedList876.ListNode node4 = new MiddleOfLinkedList876.ListNode(4, node5);
        MiddleOfLinkedList876.ListNode node3 = new MiddleOfLinkedList876.ListNode(3, node4);
        MiddleOfLinkedList876.ListNode node2 = new MiddleOfLinkedList876.ListNode(2, node3);
        var linkedList = new MiddleOfLinkedList876.ListNode(1, node2);
        assertEquals(node3, sut.middleNode(linkedList));
        assertEquals(node3, sut.middleNode1(linkedList));
    }

    @Test
    public void evenNumberReturnsMiddleNode(){
        MiddleOfLinkedList876.ListNode node6 = new MiddleOfLinkedList876.ListNode(6);
        MiddleOfLinkedList876.ListNode node5 = new MiddleOfLinkedList876.ListNode(5, node6);
        MiddleOfLinkedList876.ListNode node4 = new MiddleOfLinkedList876.ListNode(4, node5);
        MiddleOfLinkedList876.ListNode node3 = new MiddleOfLinkedList876.ListNode(3, node4);
        MiddleOfLinkedList876.ListNode node2 = new MiddleOfLinkedList876.ListNode(2, node3);
        var linkedList = new MiddleOfLinkedList876.ListNode(1, node2);
        assertEquals(node4, sut.middleNode(linkedList));
        assertEquals(node4, sut.middleNode1(linkedList));
    }

}