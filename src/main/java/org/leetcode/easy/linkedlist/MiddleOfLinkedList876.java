package org.leetcode.easy.linkedlist;

import java.util.Objects;

public class MiddleOfLinkedList876 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ListNode listNode)) return false;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }

    public ListNode middleNode(ListNode head) {

        int size = 0;
        var currentNode = head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }

        currentNode = head;
        for (int i = 1; i < size / 2 + 1; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public ListNode middleNode1(ListNode head) {
        ListNode end = head;
        ListNode middle = head;
        while (end != null && end.next != null) {
            end = end.next.next;
            middle = middle.next;
        }
        return middle;
    }
}
