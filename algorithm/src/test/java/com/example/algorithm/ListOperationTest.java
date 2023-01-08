package com.example.algorithm;

import com.example.algorithm.basicALG.list.ListOperation;

import java.util.ArrayList;
import java.util.List;

public class ListOperationTest {
    public static void main(String[] args) {
        /**
         * 选型测试
         */
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        List<Object> objects = ListOperation.noThreadListSelect();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("1");
        objects.retainAll(strings);
        System.out.println(objects);
    }
}
