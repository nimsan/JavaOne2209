package Lesson4;

public class PrintFApp {
    public static void main(String[] args) {
        //печать с помощью printf
        String formatString = "some string number %d string %s";
        System.out.printf(formatString, 10, "sdsd");
        System.out.println();
        System.out.printf(formatString, 5555, "wwwwww");

    }
}
