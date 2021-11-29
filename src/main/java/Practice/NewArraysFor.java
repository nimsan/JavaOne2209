package Practice;

import java.util.Random;

public class NewArraysFor {
    public static void main(String[] args) {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];
        int sum = 0;
        Random random = new Random(); // Генерирует случайное число
        System.out.println("Траты за неделю:");
        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);

            // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
            System.out.println("День " + (i+1) + ". Потрачено рублей: " + expenses[i]);

            sum += expenses[i];
        }
        //Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь

        System.out.println("Траты в рублях за неделю: " + sum);

    }
}
