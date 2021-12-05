package homework_6;

import java.util.Random;

public class Cat extends Animals{

    public Cat(String name, int age) {
        super(name, age);
        Random random = new Random();
        this.run = random.nextInt(200);
        this.swim = 0;


    }


}
