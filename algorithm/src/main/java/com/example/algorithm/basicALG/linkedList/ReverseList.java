package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            // 1.将head.next进行保存，截断head.
            next = head.next;
            // 2、将head.next 指向 另一个链表
            head.next = pre;
            // 3、2个链表 一个pre,一个head,head的下一个地址与pre连接。
            pre = head;
            // 4、将截断完成的next,赋值给head继续处理
            head = next;
        }
        return pre;
    }
    public String printListNode(ListNode head){
        StringBuffer stringBuffer = new StringBuffer();
        while (head != null){
            stringBuffer.append(head.val+",");
            head = head.next;
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        ReverseList reverseList = new ReverseList();
        ListNode listNode = reverseList.ReverseList(l1);
        System.out.println(reverseList.printListNode(listNode));
    }
}
