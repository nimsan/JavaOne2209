package Lesson3;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        System.out.println("Your int ="+integer);
        String word = scanner.next();
        System.out.println("word = "+word);
        String line = scanner.nextLine();
        System.out.println("line = "+line);*/

        int integer = readNumberInRange(10,20);
        System.out.println("Your int ="+integer);
    }
    public static int readNumberInRange (int left, int right){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        do {
        System.out.println("Введите число от "+left+" по "+right);
        result = scanner.nextInt();
        } while (result < left || result > right);
        return result;

    }
}
