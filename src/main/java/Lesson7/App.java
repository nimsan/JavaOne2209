package Lesson7;

/**
 * Кот голодный. Кот хочет поесть.
 * Поесть он может из тарелки.
 */
public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Baris", 20);
        Plate plate = new Plate(100);
        Plate plate2 = new Plate(200);

        //1) решение (так не надо делать)
        /*int newAmountofFood = plate.getAmountOfFood() - cat.getAppetite();
        plate.setAmountOfFood(newAmountofFood);*/

        //2) решение
        plate.decreaseAmountofFood(cat.getAppetite());

        //3) решение
        cat.eat(plate);
        cat.eat(plate2);

        System.out.println(cat);
        System.out.println(plate);
        System.out.println(plate2);
    }
}
