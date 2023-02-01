package com.example.algorithm.basicALG.tree;

import com.example.algorithm.basicALG.model.TreeNode;
import com.example.algorithm.basicALG.testCase.ListNodeTest;
import com.example.algorithm.basicALG.testCase.TreeTest;

public class hasPathSum {
    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root == null) {
            return false;
        }
        if (sum - root.val == 0 && root.left == null && root.right == null){
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeTest().treeCase1();
        new hasPathSum().hasPathSum(treeNode,22);
    }
}
