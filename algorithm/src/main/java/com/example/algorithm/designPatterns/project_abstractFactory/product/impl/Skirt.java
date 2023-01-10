package com.example.algorithm.designPatterns.project_abstractFactory.product.impl;


import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Clothes;

public class Skirt implements Clothes {
    String s = "Wear Skirt";
    public String wear(){
        System.out.println(s);
        return s;
    }
}
