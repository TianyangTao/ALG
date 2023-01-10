package com.example.algorithm.designPatterns.project_abstractFactory.product.impl;


import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Vehicle;

public class Bmw implements Vehicle {
    String s = "Drive Bmw";
    public String drive(){
        System.out.println(s);
        return s;
    }
}
