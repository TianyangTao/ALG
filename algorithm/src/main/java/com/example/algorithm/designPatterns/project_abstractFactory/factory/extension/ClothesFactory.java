package com.example.algorithm.designPatterns.project_abstractFactory.factory.extension;

import com.example.algorithm.designPatterns.project_abstractFactory.factory.AbstractFactory;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Clothes;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Food;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Vehicle;
import com.example.algorithm.designPatterns.project_abstractFactory.product.impl.Dress;
import com.example.algorithm.designPatterns.project_abstractFactory.product.impl.Skirt;


public class ClothesFactory extends AbstractFactory {
    public final static String _SKIRT = "skirt";
    public final static String _DRESS = "dress";

    // write your code here
    @Override
    public Food getFood(String food) {

        return null;
    }

    @Override
    public Clothes getClothes(String clothes) {
        if(clothes.equals(_SKIRT)) {
            return new Skirt();
        } else if(clothes.equals(_DRESS)) {
            return new Dress();
        }
        return null;
    }

    @Override
    public Vehicle getVehicle(String vehicle) {
        return null;
    }
}