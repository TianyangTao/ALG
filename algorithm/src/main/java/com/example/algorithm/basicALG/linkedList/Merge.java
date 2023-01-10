package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

public class Merge {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(list1 != null && list2 != null){
            //取较小值的节点
            if(list1.val <= list2.val){
                cur.next = list1;
                //只移动取值的指针
                list1 = list1.next;
            }else{
                cur.next = list2;
                //只移动取值的指针
                list2 = list2.next;
            }
            //指针后移
            cur = cur.next;
        }
        //哪个链表还有剩，直接连在后面
        if(list1 != null)
            cur.next = list1;
        else
            cur.next = list2;
        //返回值去掉表头
        return head.next;
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

        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        Merge m1 =new Merge();
        ListNode merge = m1.Merge(l1, l3);
        System.out.println(Merge.printListNode(merge));
    }
}
