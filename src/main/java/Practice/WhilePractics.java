package Practice;

import java.util.Scanner;
import java.util.Random;

public class WhilePractics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");
        // Напишите условие цикла для запуска игры
        while (userInput != randomInt) { // В этой переменной должен сохраняться ввод пользователя
            userInput = scanner.nextInt();
            if (userInput > randomInt) { // Условие проверяется в цикле
                System.out.println("Меньше");
            }
            if (userInput < randomInt) {        // Второе условие
                System.out.println("Больше");
            }
        }
        // Печатаем, когда число угадано
        System.out.println("Вы великолепны! Именно это я загадал.");
    }
}

