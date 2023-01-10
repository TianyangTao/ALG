package com.example.algorithm.designPatterns.project_abstractFactory.product.impl;


import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Food;

public class Meat implements Food {
    String s = "Eat Meat";
    public String eat(){
        System.out.println(s);
        return s;
    }
}
