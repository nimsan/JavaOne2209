package Lesson2;

import java.sql.SQLOutput;

public class MethodApp {
    public static void main(String[] args) {
        int calc1 = calculate(4, 6);
        int calc2 = calculate(10, 10);
        int calc4 = calculate(4);
        System.out.println(calc4);

        method1("Abracadabra", 100500);
        method1(100500, "Abracadabra");


    }
    public static void doSomething (){
        System.out.println("somthing");

    }
    public static int calculate (int a, int b) {
        return 2 * a + b;
    }
    static int calculate (int a){
        return calculate(a, a);
    }

    public static void method1 (String s, int i){
        System.out.println("Method1 "+ s + " " + i);

    }
    public static void method1 (int i, String s){
        System.out.println("Method1 "+ i + " " + s);

    }


    //<modifier> <type> <name> (<params> a..n)
}
