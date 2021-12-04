package homework_6;

import java.util.Random;

public abstract class Animals {
    protected String name;
    protected int age;
    protected int swim;
    protected int run;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;

    }

    /** todo Продумать по другому!!!!!!!!!!!!!!!!!!!!!!!!
    public void countAnimals(){
        int countDogs = 0;
        int countCats = 0;
        countDogs ++;
        countCats ++;
        System.out.println("собак "+countDogs);
    }
    */
    public void info() {
        System.out.println("Животное по кличке " + name + " Возрастом " + age + " лет.");
        System.out.println("Преодолел дистанцию по бегу " + run + " метров.");
        if (swim > 0) {
            System.out.println("Преодолел дистанцию по плаванию " + swim + " метров.");
        } else {
            System.out.println("Животное не умеет плавать");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("age is not correct");
        }
    }



}
