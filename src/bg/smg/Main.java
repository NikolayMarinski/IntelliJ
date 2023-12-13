package bg.smg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> newCar = new ArrayList<Car>();

        Car car1 = new Car();
        car1.setMakeYear(2022);
        car1.setMarka("Ford");
        car1.setModel("Mustang GT500");
        car1.setActive(true);
        newCar.add(car1);

        Car car2 = new Car();
        car2.setMakeYear(1989);
        car2.setMarka("Chevrolet");
        car2.setModel("Camaro");
        car2.setActive(true);
        newCar.add(car2);

        Car car3 = new Car();
        car3.setMakeYear(2020);
        car3.setMarka("Chevrolet");
        car3.setModel("Corvette");
        car3.setActive(true);
        newCar.add(car3);

        Car car4 = new Car();
        car4.setMakeYear(2023);
        car4.setMarka("Ford");
        car4.setModel("GT");
        car4.setActive(true);
        newCar.add(car4);

        Collections.sort(newCar);

        System.out.println(newCar);
    }
}
