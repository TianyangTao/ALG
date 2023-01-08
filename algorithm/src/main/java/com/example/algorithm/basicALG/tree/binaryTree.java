package com.example.algorithm.basicALG.tree;


import com.example.algorithm.basicALG.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陶天阳
 * @version V1.0
 * @Title: binaryTree
 * @Package com.example.algorithm.basicALG
 * @date 2023/01/07 22:43
 * @Copyright © 2020-2021 张家港众德电子科技有限公司
 */
public class binaryTree {
    public void preorder(List<Integer> list, TreeNode root){
        //遇到空节点则返回
        if(root == null)
            return;
        //先遍历根节点
        list.add(root.val);
        //再去左子树
        preorder(list, root.left);
        //最后去右子树
        preorder(list, root.right);
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] preorderTraversal (TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(list, root);
        int [] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
