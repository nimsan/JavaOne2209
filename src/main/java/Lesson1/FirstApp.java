package Lesson1;

public class FirstApp {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        int a = 12;
        a+= 5;
        int b = 10;
        int c = a + b;
        System.out.println("Наше Число "+c);

        String value = "Строка";
        System.out.println(value);
        value = value + " новая";
        System.out.println(value);
        myMethod();
        anotherMethod();
        booleanChek();

    }

    public static void myMethod() {
        System.out.println("Hello");

    }
    public static void anotherMethod() {
        System.out.println("Hello World");
    }
    public static void booleanChek (){
        int a = 10;
        int b = 11;
        boolean chek = (a==b);
        if (chek) {
            System.out.println("The same");
        } else if (a>11){
            System.out.println("Not the same");
        } else if (b>8) {
            System.out.println("Not the same2");
        }
    }
}
