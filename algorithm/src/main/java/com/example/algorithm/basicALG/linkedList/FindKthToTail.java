package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

import java.util.Stack;

public class FindKthToTail {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if (k == 0 || pHead == null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while(pHead != null){
            stack.push(pHead);
            pHead = pHead.next;
        }
        if(stack.size() < k){
            k = stack.size();
        }
        ListNode firstNode = stack.pop();
        while (--k > 0){
            ListNode temp = stack.pop();
            temp.next = firstNode;
            firstNode = temp;
        }
        return firstNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        ListNode listNode = new FindKthToTail().FindKthToTail(l1, 2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
