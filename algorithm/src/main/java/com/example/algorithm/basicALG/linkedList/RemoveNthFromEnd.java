package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head == null || n == 0){
            return null;
        }
        int nodeLength = 0;
        // 添加dummy节点作为头节点，避免特殊处理链表头节点的情况
        ListNode dummy = new ListNode(0);
        dummy.next =head;
        ListNode fast = head;
        ListNode slow = head;
        while (head != null){
            nodeLength++;
            head = head.next;
        }
        if (nodeLength < n || nodeLength < 2){
            return null;
        }
        if (nodeLength == n){
            return fast.next;
        }
        System.out.println(nodeLength);
        int length = nodeLength - n ;
        int i = 0;
        while (slow != null){
            i++;
            if (i == length){
                slow.next = slow.next.next;

            }
            slow = slow.next;
        }
        return dummy.next;
    }
    public void printfn(ListNode listNode){
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//
//        ListNode l5 = new ListNode(5);
//        ListNode l6 = new ListNode(6);
//        ListNode l7 = new ListNode(7);
//        ListNode l8 = new ListNode(8);
        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        l5.next=l6;
//        l6.next=l7;
//        l7.next=l8;
        ListNode listNode = new RemoveNthFromEnd().removeNthFromEnd(l1, 1);
        new RemoveNthFromEnd().printfn(listNode);

    }
}
