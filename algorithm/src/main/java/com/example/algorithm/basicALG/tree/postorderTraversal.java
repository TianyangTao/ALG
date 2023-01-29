package com.example.algorithm.basicALG.tree;

import com.example.algorithm.basicALG.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class postorderTraversal {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] postorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        int [] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public void inOrder(TreeNode root, List<Integer> list){
        if(root != null){
            inOrder(root.left,list);
            inOrder(root.right,list);
            list.add(root.val);
        }
    }
    
}
