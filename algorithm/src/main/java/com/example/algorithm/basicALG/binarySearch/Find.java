package com.example.algorithm.basicALG.binarySearch;

public class Find {
    public boolean Find(int target, int [][] array) {
        int xLenth = array.length;
        for (int i = 0; i < xLenth; i++) {
            if (array[i].length <= 0)
            {
                continue;
            }
            int head=0;
            int end = array[i].length - 1;
            while (head <= end){
                int mid = head + (end - head) / 2;
                if (array[i][mid] == target){
                    return true;
                }
                else if (array[i][mid] < target){
                    head = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] [] array = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15}};
        System.out.println(array.length);
    }
}
