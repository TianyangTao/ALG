package com.example.algorithm.basicALG.string;

import java.time.Period;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Stack;

public class trans {
    public String trans(String s, int n) {
        // write code here
        if (n == 0){
            return s;
        }
        StringBuffer stringBuilder = new StringBuffer();
        /**
         * 大小写转换
         */
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length; i++){
            if (chars[i] <= 0x5A && chars[i] >= 0x41){
                chars[i] = (char) (chars[i] + 0x20);
            }
            else if (chars[i] <= 'z' && chars[i] >= 'a'){
                chars[i] = (char) (chars[i] - 0x20);
            }
        }
        String str = String.valueOf(chars);
        System.out.println(str);

        Stack<String> temp=new Stack<String>();
        int tempj = 0;
        int tempi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                tempi = i;
                tempj = j;
                if (chars[j] == 32){
                    temp.push(str.substring(i , j));
                    temp.push(" ");
                    //为了回到空字符串位置
                    i = j;
                    break;
                }
                if (j == n -1) {
                    temp.push(str.substring(i , j + 1));
                    i = j;
                    break;
                }
            }
        }
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.peek());
            temp.pop();
//            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "This is a sample";
        String trans = new trans().trans(s, 16);
        System.out.println(trans);
    }

}
