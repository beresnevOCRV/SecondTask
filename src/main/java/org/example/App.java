package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class App {

  // пока без кастомного события, вернусь к нему как будет время

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AutoFactory autoFactory = context.getBean("autoFactory", AutoFactory.class);
        AutoFactory autoFactory1 = context.getBean("autoFactory", AutoFactory.class);

        autoFactory.setProductionLine(new SedanProductionLine());

        autoFactory.runProduction();
        autoFactory1.runProduction();

      //дополенние к первому заданию
        System.out.println();
        System.out.println("Cars built:" + (autoFactory.getCarsBuilt() + autoFactory1.getCarsBuilt()));;
        System.out.println("Parts missing count:" + (autoFactory.getCarsNotBuilt() + autoFactory1.getCarsNotBuilt()));
    }

    public static boolean getRandomBool() {
        Random random = new Random();
        return random.nextBoolean();
    }

}
