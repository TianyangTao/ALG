package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

/**
 * 解题重点：res头节点的作用是用来定位返回的，
 *         pre索引头节点
 *         cur位移节点
 *         temp临时节点与cur交互
 */
public class reverseKGroup {
    /**
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res;
        ListNode cur = head;
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
//        for(int i = 0; i < length/k; i++){
//            for(int j = 1; j < k; j++){
                ListNode temp = cur.next;
                cur.next = temp.next;
                temp.next = pre.next;
                pre.next = temp;
//            }
            System.out.println(printListNode(cur));
            System.out.println(printListNode(temp));
            System.out.println(printListNode(pre));
            pre = cur;
            cur = cur.next;
//        }
        return res.next;
    }
    public ListNode reverseKGroup1 (ListNode head, int k) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res;
        ListNode cur = head;
        ListNode cur1 = head.next;
        // 替换 把 cur的下一个节点取出来，
        ListNode temp = cur.next;
        ListNode temp1 = res.next.next;
//        cur.next = temp.next;
        cur.next = null;
        head.next = null;

        System.out.println("temp:"+printListNode(temp));
        System.out.println("temp1:"+printListNode(temp1));
        System.out.println("cur:"+printListNode(cur));
        System.out.println("cur:"+printListNode(cur1));
        System.out.println("head:"+printListNode(cur));
        System.out.println("res:"+printListNode(res));
        System.out.println("pre:"+printListNode(pre));

        return res.next;
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
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
//        ListNode l6 = new ListNode(6);
//        ListNode l7 = new ListNode(7);
//        ListNode l8 = new ListNode(8);
        l1.next=l2;
        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        l5.next=l6;
//        l6.next=l7;
//        l7.next=l8;
        reverseKGroup reverse = new reverseKGroup();
        ListNode listNode = reverse.reverseKGroup(l1, 3);
        String s = reverse.printListNode(listNode);
        System.out.println(s);
    }
}
