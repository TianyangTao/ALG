package com.example.algorithm.basicALG;

/**
 * @author 陶天阳
 * @version V1.0
 * @Title: test
 * @Package com.example.algorithm.basicALG
 * @date 2022/11/03 22:16
 * @Copyright © 2020-2021 张家港众德电子科技有限公司
 */

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int i) {
        this.val = i;
    }
}

public class test {
    /**
     * @param head ListNode类
     * @param m    int整型
     * @param n    int整型
     * @return ListNode类
     */
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
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        test reverse = new test();
        ListNode listNode = reverse.reverseBetween(l1, 2, 4);
        String s = reverse.printListNode(listNode);
    }
}