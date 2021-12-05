package Lesson6;

import Lesson5.Car;

public class OopDemo {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("red",1988,"Audi A"+(i+1));
        }

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }

        //foreach
        for (Car car :cars){
            car.setYear(2020);
            System.out.println(car);
        }
        Car.summaryInfo();

    }
}
