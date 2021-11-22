package Lesson5;

public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;

    public Cat(String name, String color, int age, double weight) { // 1 конструктор
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, String color, int age) { // если добавить новый параметр weight, но чтобы все работало можно скопировать старые параметры и добавить в this цифру 0 (ранее написанный код будет работать за счет перегрузки)
        this(name, color, age, 0);
    }

    public Cat(String color, int age) {
        this("Неизвестно", color, age);// вызвали 1 конструктор
        //this.color = color;
        //this.age = age;
        //this.name = "Неизвестно";
    }

    public Cat(String color) {
        this("Неизвестно", color, 6);


    }

    /**
     * Выводит в консоль информацию об объекте
     */
    public void info() {
        System.out.println(this);
    //    System.out.println("Name = " + name + " Color = " + color + " Age = " + age);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age is negative");
        }
    }


}


