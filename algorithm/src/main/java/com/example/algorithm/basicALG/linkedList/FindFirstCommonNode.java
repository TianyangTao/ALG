package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2){
            l1 =(l1==null)?pHead2 : l1.next;
            l2 =(l2==null)?pHead1 : l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(4);
        ListNode l8 = new ListNode(3);
        ListNode l9 = new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;

        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        l8.next=l9;
        ListNode listNode = new FindFirstCommonNode().FindFirstCommonNode(l1, l5);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
