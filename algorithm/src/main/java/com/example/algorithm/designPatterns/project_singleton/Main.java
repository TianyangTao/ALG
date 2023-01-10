package com.example.algorithm.designPatterns.project_singleton;

public class Main {
    public static void main(String[] args) {

        SingleClass singleClass1 = SingleClass.getInstance();
        SingleClass singleClass2 = SingleClass.getInstance();
        if(singleClass1.equals(singleClass2))
            System.out.println(singleClass1.toString());
        else
            System.out.println("They are different instance.");

    }
}
