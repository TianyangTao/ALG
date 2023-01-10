package com.example.algorithm.designPatterns.project_abstractFactory.factory.extension;


import com.example.algorithm.designPatterns.project_abstractFactory.factory.AbstractFactory;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Clothes;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Food;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Vehicle;
import com.example.algorithm.designPatterns.project_abstractFactory.product.impl.Benz;
import com.example.algorithm.designPatterns.project_abstractFactory.product.impl.Bmw;

public class VehicleFactory extends AbstractFactory {
    public final static String _BENZ = "benz";
    public final static String _BMW = "bmw";

    // write your code here
    @Override
    public Clothes getClothes(String clothes){
        return null;
    }

    @Override
    public Food getFood(String food){
        return null;
    }

    @Override
    public Vehicle getVehicle(String vehicle){
        switch(vehicle) {
            case _BENZ: return new Benz();
            case _BMW: return new Bmw();
            default: return null;
        }
    }
}
