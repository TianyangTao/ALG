package com.example.algorithm.basicALG.binarySearch;

import java.util.Collections;

public class search {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] nums, int target) {
        // write code here
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            int m = (l + r) / 2;
            if(nums[m] == target){
                return m;
            }
            if(nums[m] > target){
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,3,5,7,9,2,4,6,8,10};
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int k : nums){
            System.out.println(k);
        }
        int search = new search().search(nums, 6);
        System.out.println(search);
    }
}
