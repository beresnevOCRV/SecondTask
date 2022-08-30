package org.example;

public class CoupeProductionLine  implements  ProductionLine {
    public CoupeProductionLine() {
    }

    @Override
    public void work() {
      // дополнение к первому заданию
        Car newCar = new Car("White");
    }

}
