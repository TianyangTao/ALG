package com.example.algorithm.designPatterns.project_abstractFactory.product.impl;


import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Clothes;

public class Dress implements Clothes {
    String s = "Wear Dress";
    public String wear(){
        System.out.println(s);
        return s;
    }
}