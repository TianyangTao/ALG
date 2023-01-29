package com.example.algorithm.basicALG.tree;

import com.example.algorithm.basicALG.model.TreeNode;
import com.example.algorithm.basicALG.testCase.TreeTest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class levelOrder {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> rList = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return rList;
        }
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            int limit = queue.size();
            for(int i = 0; i < limit; i ++){
                TreeNode tNode = queue.poll();
                result.add(tNode.val);
                if(tNode.left != null){
                    queue.add(tNode.left);
                }
                if(tNode.right != null){
                    queue.add(tNode.right);
                }
            }
            rList.add(result);
        }
        return rList;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeTest.treeCase1();
        ArrayList<ArrayList<Integer>> arrayLists = new levelOrder().levelOrder(treeNode);
        System.out.printf(String.valueOf(arrayLists));
    }
}
