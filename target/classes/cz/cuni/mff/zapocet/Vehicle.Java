package cz.cuni.mff.zapocet;

public class Vehicle {
    private VehicleModelTypeRecord model;
    private int capacity;
    private String history;
    public Vehicle(VehicleTypes type, String model, int capacity) {
        this.model = new VehicleModelTypeRecord(type, model);
        this.capacity = capacity;
        this.history = "";
    }
    public void addHistory(String eventToLog){history = history + eventToLog + "\n";}
}

