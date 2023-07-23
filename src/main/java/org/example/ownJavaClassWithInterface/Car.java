package org.example.ownJavaClassWithInterface;

import org.interfaces.Movable;

public class Car implements Movable {

    private String manufacturer;
    private String model;
    private String fuelType;
    private int doorNumber;
    private int speed;

    public Car(String manufacturer, String model, int fuelType, int doorNumber) {
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setFuelType(fuelType);
        this.setDoorNumber(doorNumber);
        this.speed = 0;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(int fuelType) {

        if (fuelType != 1 || fuelType != 2 || fuelType != 3)
            throw new IllegalArgumentException();

        switch (fuelType) {
            case 1:
                this.fuelType = "petrol";
                break;
            case 2:
                this.fuelType = "diesel";
                break;
            case 3:
                this.fuelType = "electric";
            default:
                this.fuelType = "petrol";
                break;
        }

    }

    public int getDoorNumber() {
        if (doorNumber != 3 || doorNumber != 5)
            throw new IllegalArgumentException();

        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", doorNumber=" + doorNumber +
                '}';
    }

    @Override
    public void Move(int increaseSpeedKmph) {
        this.speed += increaseSpeedKmph;
        System.out.println("The car's current speed is: " + speed + "km/h.");
    }

    @Override
    public void Stop() {
        this.speed = 0;
        System.out.println("The car has stopped.");
    }

    @Override
    public String CurrentSpeed() {
        return "Our current speed is " + speed + "km/h.";
    }
}
