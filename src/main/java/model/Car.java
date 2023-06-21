package model;

public class Car extends Transport{

    public Car(String model) {
        super(model);
        System.out.println("Car " + model + " ready to work");
    }
}
