package com.example.algorithm.basicALG;

import java.util.Arrays;

/**
 * @author 陶天阳
 * @version V1.0
 * @Title: BubbleSort
 * @Package com.example.algorithm.basicALG
 * @date 2022/10/23 21:09
 * @Copyright © 2020-2021 张家港众德电子科技有限公司
 */
public class BubbleSort {
    /**
     * 冒泡排序：降序
     * @param arr
     */
    public static void Bsort(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};
        Bsort(arr);
        System.out.println(Arrays.stream(arr).findFirst());
    }
}
