package com.example.algorithm.designPatterns.project_abstractFactory.factory;


import com.example.algorithm.designPatterns.project_abstractFactory.factory.extension.ClothesFactory;
import com.example.algorithm.designPatterns.project_abstractFactory.factory.extension.FoodFactory;
import com.example.algorithm.designPatterns.project_abstractFactory.factory.extension.VehicleFactory;

public class FactoryProducer {
    private static ClothesFactory clothesFactory = new ClothesFactory();
    private static FoodFactory foodFactory = new FoodFactory();
    private static VehicleFactory vehicleFactory = new VehicleFactory();
    public static AbstractFactory getFactory(String choice){
        // write your code here
        if(choice.equalsIgnoreCase(AbstractFactory._FOODFACTORY)){
            return foodFactory;
        }else if(choice.equalsIgnoreCase(AbstractFactory._CLOTHESFACTORY)){
            return clothesFactory;
        }else if(choice.equalsIgnoreCase(AbstractFactory._VEHICLEFACTORY)){
            return vehicleFactory;
        }
        return null;
    }
}
