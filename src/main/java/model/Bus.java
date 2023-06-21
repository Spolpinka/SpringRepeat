package model;

public class Bus extends Transport{
    public Bus(String model) {
        super(model);
        System.out.println("Bus " + model + " ready to work");
    }
}
