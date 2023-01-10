package com.example.algorithm.casic.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 创建队列时选项类
 */
public class ListOperation {
    /**
     *
     * @param <T>
     * @return LinkedList
     * @apiNote
     * 此方法根据需求进行选型
     * LinkedList 底层数据结构是链表，查询慢，增删快，线程不安全，效率高，可以存储重复元素
     *
     */
    public static <T> List<T> noThreadListAdd(){
        return new LinkedList<>();
    }

    /**
     *
     * @param <T>
     * @return ArrayList
     * @apiNote
     * ArrayList：底层数据结构是数组，查询快，增删慢，线程不安全，效率高，可以存储重复元素
     */
    public static <T> List<T> noThreadListSelect(){
        return new ArrayList<>();
    }

    /**
     *
     * @param <T>
     * @return Vector
     * @apiNote
     * Vector:底层数据结构是数组，查询快，增删慢，线程安全，效率低，可以存储重复元素
     */
    public static <T> List<T> ThreadListSelect(){
        return new Vector<>();
    }

}
