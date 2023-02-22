package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

public class AddInList {
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
    /**
     *
     * @param head1 ListNode类 
     * @param head2 ListNode类 
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        ListNode node1 = ReverseList(head1);
        ListNode node2 = ReverseList(head2);
        if (node1 == null && node2 == null){
            return null;
        }
        if (node1 != null && node2 == null){
            return node1;
        }
        if (node2 != null && node1 == null){
            return node2;
        }
        ListNode newNode = new ListNode(-1);
        ListNode pre = newNode;
        int nextVal = 0;
        while (node1 != null && node2 != null){
            int val = node1.val + node2.val + nextVal;
            pre.next = new ListNode(val % 10);
            nextVal = val / 10;
            if (node1 !=null) {
                node1 = node1.next;
            }
            if (node2 != null) {
                node2 = node2.next;
            }
            pre = pre.next;
        }
        while (node1 != null){
            int val = node1.val + nextVal;
            pre.next = new ListNode(val % 10);
            nextVal = val / 10;
            pre = pre.next;
            node1 = node1.next;
        }
        while (node2 != null){
            int val = node2.val + nextVal;
            pre.next = new ListNode(val % 10);
            nextVal = val / 10;
            pre = pre.next;
            node2 = node2.next;
        }
        if (nextVal != 0){
            pre.next = new ListNode(nextVal);
        }
        return  ReverseList(newNode.next);
    }
    public static String printListNode(ListNode head){
        StringBuffer stringBuffer = new StringBuffer();
        while (head != null){
            stringBuffer.append(head.val+",");
            head = head.next;
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(9);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(7);
        ListNode l4=new ListNode(6);
        ListNode l5=new ListNode(3);
//        ListNode l6=new ListNode(3);

        l1.next=l2;
        l2.next=l3;
        l4.next = l5;
//        l5.next = l6;
        AddInList addInList = new AddInList();
        ListNode listNode = addInList.addInList(l1,l4);
        System.out.println(printListNode(listNode));
    }
}
