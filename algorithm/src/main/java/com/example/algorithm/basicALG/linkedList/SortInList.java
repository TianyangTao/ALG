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
}
