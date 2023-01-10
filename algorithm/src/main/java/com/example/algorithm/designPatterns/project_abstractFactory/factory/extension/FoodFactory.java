package com.example.algorithm.designPatterns.project_abstractFactory.factory.extension;


import com.example.algorithm.designPatterns.project_abstractFactory.factory.AbstractFactory;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Clothes;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Food;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Vehicle;
import com.example.algorithm.designPatterns.project_abstractFactory.product.impl.Apple;
import com.example.algorithm.designPatterns.project_abstractFactory.product.impl.Meat;

public class FoodFactory extends AbstractFactory {
    public final static String _APPLE = "apple";
    public final static String _MEAT = "meat";

    // write your code here
    @Override
    public Food getFood(String food) {
        if(food.equals(_APPLE)) {
            return new Apple();
        } else if(food.equals(_MEAT)) {
            return new Meat();
        }
        return null;
    }

    @Override
    public Clothes getClothes(String clothes) {
        return null;
    }

    @Override
    public Vehicle getVehicle(String vehicle) {
        return null;
    }
}
