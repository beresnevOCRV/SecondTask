package org.example;

import org.springframework.stereotype.Component;

@Component("CoupeProdLine")
public class CoupeProductionLine  implements  ProductionLine {

    public CoupeProductionLine() {}

    @Override
    public Car work() {
        // дополнение к первому заданию
        Car newCar = new Car("White", App.getRandomBool());

        if (newCar.isPartsDelivered()) {
            System.out.println(newCar.getCarColour() + " " + "Coupe built");
            return newCar;
        }
        return null;
    }

}
