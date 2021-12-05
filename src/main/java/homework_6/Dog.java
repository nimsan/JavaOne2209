package homework_6;

import java.util.Random;

public class Dog extends Animals {
    public Dog(String name, int age) {
    super(name,age);
    Random random = new Random();
    int a = random.nextInt(500);
    int b = random.nextInt(9+1);

    this.run = a;
    this.swim = b;

    }
    /**
    @Override
    public void countAnimals() {
        super.countAnimals();
    }
    */
}
