package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeM {
    public static ListNode merge(ListNode listNode1, ListNode listNode2){
        if (listNode1 == null && listNode2 == null){
            return null;
        }
        if (listNode1 == null){
            return listNode2;
        }
        if (listNode2 == null){
            return listNode1;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(listNode1 != null && listNode2 != null){
            if (listNode1.val < listNode2.val) {
                cur.next = listNode1;
                listNode1 = listNode1.next;
                cur = cur.next;
            }else {
                cur.next = listNode2;
                listNode2 = listNode2.next;
                cur = cur.next;
            }
        }
        if (listNode1 != null){
            cur.next = listNode1;
        }
        if (listNode2 != null){
            cur.next = listNode2;
        }
        return head.next;
    }

    /**
     * 分治
     * @param list
     * @param left
     * @param right
     * @return
     */
    public static ListNode divideMerge(ArrayList<ListNode> list, int left, int right){
        if(left > right){
            return null;
        }
        else if(left == right)
            return list.get(left);
        int mid = (left + right) / 2;
        return merge(divideMerge(list, left, mid),divideMerge(list,mid+1,right));
    }
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        //k个链表归并排序
        return divideMerge(lists, 0, lists.size() - 1);
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode3l = new ListNode(6);
        ListNode listNode3r = new ListNode(10);

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);

        ListNode listNode8 = new ListNode(8);
        ListNode listNode9 = new ListNode(12);
        ListNode listNode10 = new ListNode(17);
        ListNode listNode11 = new ListNode(19);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode3l;
        listNode3l.next = listNode3r;

        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        listNode8.next = listNode9;
        listNode9.next = listNode10;
        listNode10.next = listNode11;

        ArrayList<ListNode> list = new ArrayList<>();
        list.add(listNode1);
        list.add(listNode4);
        list.add(listNode8);
//        ListNode merge = new MergeM().merge(list.get(0), list.get(1));
//        while (merge != null){
//            System.out.println(merge.val);
//            merge = merge.next;
//        }

        ListNode listNode = new MergeM().mergeKLists(list);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
