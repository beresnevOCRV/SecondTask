package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AutoFactory autoFactory = context.getBean("auto_factory", AutoFactory.class);
        AutoFactory autoFactory1 = context.getBean("auto_factory1", AutoFactory.class);

      // дополенние к первому заданию
        autoFactory.runProduction();
        System.out.println("Sedan built:" + autoFactory.getProductionSize());
        autoFactory1.runProduction();
        System.out.println("Coupe built:" + autoFactory1.getProductionSize());

    }

}
