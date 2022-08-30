package org.example;

import org.springframework.stereotype.Component;

@Component
public class SedanProductionLine implements ProductionLine {

    public SedanProductionLine() {}

    @Override
    public Car work() {
      // дополнение к первому заданию
        Car newCar = new Car("Black", App.getRandomBool());

        if (newCar.isPartsDelivered()) {
            System.out.println(newCar.getCarColour() + " " + "Sedan built");
            return newCar;
        }
        return null;
    }

}
