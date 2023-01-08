package com.example.algorithm.basicALG.tree;

import com.example.algorithm.basicALG.model.TreeNode;
import com.example.algorithm.basicALG.testCase.TreeTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陶天阳
 * @version V1.0
 * @Title: inorderTraversal
 * @Package com.example.algorithm.basicALG.tree
 * @date 2023/01/08 19:28
 * @Copyright © 2020-2021 张家港众德电子科技有限公司
 */
public class inorderTraversal {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int [] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static void inOrder(TreeNode root, List<Integer> list) {
        if (root != null){
            inOrder(root.left, list);
            inOrder(root.right, list);
            list.add(root.val);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeTest.treeCase1();
        int[] ints = new inorderTraversal().inorderTraversal(treeNode);
        for (int i : ints){
            System.out.print(i+",");
        }
    }
}
