package com.example.algorithm;

import com.example.algorithm.basicALG.list.BasicList;

import java.util.ArrayList;
import java.util.List;

public class BasicListTest {

    public static void main(String[] args) {
        int [] intarr = new int[]{1,2,3};
        ArrayList<String> objects = new ArrayList<String>(){{
            add("1");
            add("1");
            add("1");
        }};
        List error = BasicList.basicClassToList(intarr);
        BasicList.subClearList(objects,0,1);
        System.out.println(objects);
        System.out.println(error);
    }
}
