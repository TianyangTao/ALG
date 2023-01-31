package com.example.algorithm.basicALG.tree;

import com.example.algorithm.basicALG.model.TreeNode;
import com.example.algorithm.basicALG.testCase.TreeTest;

import java.util.*;

public class zprintTree{
    /**
     * 每个根节点下的值偶数正序，奇数逆序
     * @param pRoot
     * @return
     */
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> rList = new ArrayList<ArrayList<Integer>>();
        Queue <TreeNode> queue = new ArrayDeque<>();
        if (pRoot == null){
            return rList;
        }
        queue.add(pRoot);
        boolean count = true;
        while(!queue.isEmpty()){
            count = !count;
            ArrayList<Integer> aList = new ArrayList<>();
            int limit = queue.size();
            for (int i = 0; i < limit; i++){
                TreeNode poll = queue.poll();
                aList.add(poll.val);
                if (poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            if (!count) {
                Collections.reverse(aList);
            }
            rList.add(aList);
        }
        return rList;
    }
    public ArrayList<ArrayList<Integer>> zPrint(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> rList = new ArrayList<ArrayList<Integer>>();
        Queue <TreeNode> queue = new ArrayDeque<>();
        if (pRoot == null){
            return rList;
        }
        queue.add(pRoot);
        int count = 0;
        while(!queue.isEmpty()){
            count++;
            ArrayList<Integer> aList = new ArrayList<>();
            int limit = queue.size();
            for (int i = 0; i < limit; i++){
                TreeNode poll = queue.poll();
                aList.add(poll.val);
                if(count % 2 == 0){
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                    if (poll.left != null){
                        queue.add(poll.left);
                    }
                }
                if(count % 2 == 1){
                    if (poll.left != null){
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
            }
            rList.add(aList);
        }
        return rList;
    }
    public static void main(String[] args) {
        TreeNode treeNode = TreeTest.treeCase1();
        ArrayList<ArrayList<Integer>> arrayLists = new zprintTree().Print(treeNode);
        System.out.printf(String.valueOf(arrayLists));
    }
}
