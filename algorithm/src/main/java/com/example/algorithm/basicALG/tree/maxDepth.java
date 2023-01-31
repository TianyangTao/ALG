package com.example.algorithm.basicALG.tree;

import com.example.algorithm.basicALG.model.TreeNode;
import com.example.algorithm.basicALG.testCase.TreeTest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class maxDepth {
    /**
     * @param root TreeNode类
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        // write code here
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
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
            count++;
        }
        return count;
    }
    public int maxDepthRecursion (TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepthRecursion(root.left), maxDepthRecursion(root.right)) + 1;
    }
    public static void main(String[] args) {
        TreeNode treeNode = TreeTest.treeCase1();
        System.out.printf(new maxDepth().maxDepthRecursion(treeNode)+"");
    }
}
