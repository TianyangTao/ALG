package com.example.algorithm.designPatterns.project_abstractFactory.product.impl;


import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Food;

public class Apple implements Food {
    String s="Eat Apple";
    public String eat(){
        System.out.println(s);
        return s;
    }
}