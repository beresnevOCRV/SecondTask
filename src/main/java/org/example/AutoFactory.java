package org.example;

public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public void runProduction() {
        int autoBuilt = 0;

        while (autoBuilt < productionSize) {
            productionLine.work();
            autoBuilt++;
        }
    }

    public int getProductionSize() {
        return productionSize;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

}
