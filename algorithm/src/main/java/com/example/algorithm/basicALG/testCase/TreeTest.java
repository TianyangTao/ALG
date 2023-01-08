package com.example.algorithm.basicALG.testCase;

import com.example.algorithm.basicALG.model.TreeNode;

/**
 * @author 陶天阳
 * @version V1.0
 * @Title: TreeTest
 * @Package com.example.algorithm.basicALG.testCase
 * @date 2023/01/08 19:02
 * @Copyright © 2020-2021 张家港众德电子科技有限公司
 */
public class TreeTest {
    public static TreeNode treeCase1(){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        treeNode1.right = treeNode5;
        treeNode5.left = treeNode6;
        return treeNode1;
    }
}
