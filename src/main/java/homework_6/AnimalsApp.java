package homework_6;

public class AnimalsApp {


    public static void main(String[] args) {
        Cat cat = new Cat("Murka", 3);
        Cat cat1 = new Cat("Grey", 7);
        Cat cat2 = new Cat("Vasya", 2);
        Cat cat3 = new Cat("May", 4);
        Cat cat4 = new Cat("Tomas", 1);
        String cats [] = {"marsik", "Markus", "Mimito"};
        cat.info();
        cat1.info();
        cat2.info();
        cat3.info();
        cat4.info();
        Dog dog = new Dog("Sharik", 5);
        Dog dog1 = new Dog("Bobik", 8);
        Dog dog2 = new Dog("Tuzik", 2);
        dog.info();
        dog1.info();
        dog2.info();

    }
}
