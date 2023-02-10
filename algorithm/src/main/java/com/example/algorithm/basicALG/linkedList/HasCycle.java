package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(slow != null && fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
