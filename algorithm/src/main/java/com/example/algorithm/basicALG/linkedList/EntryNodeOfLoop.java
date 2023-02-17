package com.example.algorithm.basicALG.linkedList;

import com.example.algorithm.basicALG.model.ListNode;

import java.util.HashSet;

public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop_hash(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<>();
        while(pHead != null){
            // 当set中包含结点，说明第一次出现重复的结点，即环的入口结点
            if(set.contains(pHead)){
                return pHead;
            }
            // set中加入未重复的结点
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
    public ListNode EntryNodeOfLoop_fastAndLow(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        boolean hasCycle = false;
        while(slow != null && fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                hasCycle =true;
               break;
            }
        }
        if (!hasCycle){
            return null;
        }
        fast = pHead;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;


    }
}
