package org.example;

public class Car {
    private String carColour;
    private boolean partsDelivered;

    public Car(String carColour, boolean partsDelivered) {
        this.partsDelivered = partsDelivered;
        this.carColour = carColour;
    }

    public String getCarColour() {
        return carColour;
    }

    public boolean isPartsDelivered() {
        return partsDelivered;
    }

    public void setPartsDelivered(boolean partsDelivered) {
        this.partsDelivered = partsDelivered;
    }
}
