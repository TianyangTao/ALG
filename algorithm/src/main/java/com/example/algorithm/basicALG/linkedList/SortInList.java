package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class SortInList {
    /**
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        // write code here
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode pre = head;
        while (pre != null){
            nums.add(pre.val);
            pre = pre.next;
        }
        pre = head;
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            pre.val = nums.get(i);
            pre = pre.next;
        }
        return head;
    }
    public ListNode sortInList_Node (ListNode head) {
        // write code here
        ListNode firstNode = head;
        ListNode temp = null;
        ListNode pre = null;
        // 存下后面节点
        // 交换首节点
        // 实现分离
        while (firstNode != null){
            // 翻转
            temp = firstNode.next;
            firstNode.next = pre;
            pre = firstNode;
            firstNode = temp;
        }
        return pre;
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
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        SortInList sortInList = new SortInList();
        ListNode listNode = sortInList.sortInList_Node(l1);
        System.out.println(sortInList.printListNode(listNode));
    }
}
