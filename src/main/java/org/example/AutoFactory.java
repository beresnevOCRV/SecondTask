package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class AutoFactory {
    private int productionSize;
    private int carsBuilt;
    private int carsNotBuilt;

    @Autowired
    @Qualifier("CoupeProdLine")
    private ProductionLine productionLine;

    public AutoFactory() {
    }

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public void runProduction() {
        for (int i = 0; i < productionSize; i++) {
            if (productionLine.work() != null) {
                carsBuilt++;
            } else { carsNotBuilt++; }
        }
    }

    public int getProductionSize() {
        return productionSize;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    public void setProductionLine(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public int getCarsBuilt() {
        return carsBuilt;
    }

    public int getCarsNotBuilt() {
        return carsNotBuilt;
    }

    @PostConstruct
    public void init_method() {
        setProductionSize(5);
    }
}
