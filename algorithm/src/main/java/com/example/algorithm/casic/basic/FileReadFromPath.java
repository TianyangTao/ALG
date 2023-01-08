package com.example.algorithm.casic.basic;

import java.io.File;

public class FileReadFromPath {

    /**
     * 获取指定目录下文件目录
     * @param path
     */
    public static void getFileName(String path) {
        File f = new File(path);//获取路径  F:测试目录
        if (!f.exists()) {
            System.out.println(path + " not exists");//不存在就输出
            return;
        }

        File fa[] = f.listFiles();//用数组接收  F:笔记总结C#, F:笔记总结if语句.txt
        for (int i = 0; i < fa.length; i++) {//循环遍历
            File fs = fa[i];//获取数组中的第i个
            if (fs.isDirectory()) {
                System.out.println(fs.getName() + " [目录]");//如果是目录就输出
            } else {
                System.out.println(fs.getName());//否则直接输出
            }
        }
    }
}
