package org.example;

public class SedanProductionLine implements ProductionLine {
    public SedanProductionLine() {
    }

    @Override
    public void work() {
      // дополнение к первому заданию
        Car newCar = new Car("Black");
    }

}
