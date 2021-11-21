package Lesson5;

public class CatsApp {
    public static void main(String[] args) {

    Cat cat = new Cat("Barsik", "red", 5);

        cat.info();
        Cat cat2 = new Cat("Vasya","black", 3);
        cat2.info();
        System.out.println(cat2.getName());

        Cat cat3 = new Cat("Dark grey", 8);
        cat3.info();
        cat3.setName("Murka");

        cat3.info();

        Car car = new Car("yellow", 1999, "BMW");
        System.out.println(car);


    }
}
