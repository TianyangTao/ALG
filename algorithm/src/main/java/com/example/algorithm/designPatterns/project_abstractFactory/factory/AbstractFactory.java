package com.example.algorithm.designPatterns.project_abstractFactory.factory;


import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Clothes;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Food;
import com.example.algorithm.designPatterns.project_abstractFactory.product.ifs.Vehicle;

public abstract class AbstractFactory {
    public final static String _FOODFACTORY = "FoodFactory";
    public final static String _CLOTHESFACTORY = "ClothesFactory";
    public final static String _VEHICLEFACTORY = "VehicleFactory";


    public abstract Clothes getClothes(String clothes);
    public abstract Food getFood(String food);
    public abstract Vehicle getVehicle(String vehicle);
}
