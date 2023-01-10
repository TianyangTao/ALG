package com.example.algorithm.designPatterns.project_abstractFactory.product.impl;


import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Vehicle;

public class Benz implements Vehicle {
    String s = "Drive Benz";
    public String drive(){
        System.out.println(s);
        return s;
    }
}