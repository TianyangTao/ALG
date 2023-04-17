package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

import java.util.ArrayList;

public class IsPail {
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Integer [] nodeArray = new Integer[list.size()];
        list.toArray(nodeArray);
        int start = 0;
        int end = list.size() - 1;
        while(start < end){
            if (!nodeArray[start++].equals(nodeArray[end--]) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-401261);
        ListNode node2 = new ListNode(-449050);
        ListNode node3 = new ListNode(-456674);
        ListNode node4 = new ListNode(-456674);
        ListNode node5 = new ListNode(-449050);
        ListNode node6 = new ListNode(-401261);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        boolean pail = new IsPail().isPail(node1);
        System.out.println(pail);

    }
}
