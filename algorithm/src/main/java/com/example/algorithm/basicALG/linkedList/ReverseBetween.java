package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;
import com.example.algorithm.basicALG.testCase.ListNodeTest;

/**
 * 区间链表反转
 */
public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        //加个表头
        ListNode res = new ListNode(-1);
        res.next = head;
        //前序节点
        ListNode pre = res;
        //当前节点
        ListNode cur = head;
        //找到m
        for (int i = 1; i < m; i++) {
            pre = cur;
            System.out.println(printListNode(pre));
            cur = cur.next;
            System.out.println(printListNode(cur));
        }
        System.out.println("--------------");
        //从m反转到n
        for (int i = m; i < n; i++) {
//            1  3  2  4  5  6  7
            ListNode temp = cur.next;
            System.out.println("1 " + printListNode(temp));
            cur.next = temp.next;
            System.out.println("2 " + printListNode(cur.next));

            temp.next = pre.next;
            System.out.println("3 " + printListNode(temp.next));
            pre.next = temp;
            System.out.println("4 " + printListNode(pre.next));
        }
        //返回去掉表头
        return res.next;
    }

    public static String printListNode(ListNode head) {
        StringBuffer stringBuffer = new StringBuffer();
        while (head != null) {
            stringBuffer.append(head.val + ",");
            head = head.next;
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        ListNode l1 = ListNodeTest.testCase1();
        ReverseBetween reverse = new ReverseBetween();
        ListNode listNode = reverse.reverseBetween(l1, 2, 4);
        String s = reverse.printListNode(listNode);
    }
}
