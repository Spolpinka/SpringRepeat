package model;

public class Pickup extends Transport {
    public Pickup(String model) {
        super(model);
        System.out.println("Pickup " + model + " ready to work");
    }
}
