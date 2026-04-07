package cz.cuni.mff.zapocet;

public class Vehicle {
    private VehicleModelTypeRecord model;
    private int capacity;
    private String history;
    public Vehicle(VehicleModelTypeRecord model, int capacity, String history) {
        this.model = model;
        this.capacity = capacity;
        this.history = history;
    }
    
}

