package homework_3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        /* 1) Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        // Var_1
        int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrayOne.length; i++) {
        }
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == 1) {
                arrayOne[i] = arrayOne[i] + 1;
            }
            if (arrayOne[i] == 0) {
                arrayOne[i] = 1;
            }
            if (arrayOne[i] == 2) {
                arrayOne[i] = 0;
            }
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();//Space

        // Var_2
        int[] arrayOne2 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int j = 0; j < arrayOne2.length; j++) {
            if (arrayOne2[j] == 1) {
                arrayOne2[j] = 0;
            } else {
                arrayOne2[j] = 1;
            }

            System.out.print(arrayOne2[j] + " ");
        }
        System.out.println();//Space
        /** 2) Задать пустой целочисленный массив длиной 100.
         С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        int[] arrayTwo = new int[100];
        for (int i = 0; i < arrayTwo.length; i++) {

            arrayTwo[i] = i;
            System.out.println(arrayTwo[i]);
        }
        System.out.println();//Space
        /** 3) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        // todo: подумать еще!
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6) {
                System.out.print(arrayThree[i] * 2 + " ");
            }
        }

        System.out.println();

        System.out.println();//Space
        arrDiagonal();
        arrayFive();
        searchMaxAndMin();
        methodBoolean();

    }

    /**
     * 4) Создать квадратный двумерный целочисленный массив
     * (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void arrDiagonal() {
        int[][] arr4 = new int[4][4];
        arr4[0][0] = 1;
        arr4[1][1] = 1;
        arr4[2][2] = 1;
        arr4[3][3] = 1;
        arr4[0][3] = 1;
        arr4[1][2] = 1;
        arr4[2][1] = 1;
        arr4[3][0] = 1;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 5) Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static void arrayFive() {
        int len = 10;
        int initialValue = 5;
        int[] resultat = new int[len];
        Arrays.fill(resultat, initialValue);
        System.out.println(Arrays.toString(resultat));

    }

    /**
     * 6) Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    public static void searchMaxAndMin() {
        int[] arraysMaxMin = {5, 56, 73, 32, 13, 66};
        int min, max;
        min = max = arraysMaxMin[0];
        for (int i = 0; i < arraysMaxMin.length; i++) {
            if (arraysMaxMin[i] < min) min = arraysMaxMin[i];
            if (arraysMaxMin[i] > max) max = arraysMaxMin[i];
        }
        System.out.println("min AND max :" + min + " " + max);
        System.out.println();//Space
    }

    /**
     * 7) ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     */

    public static void methodBoolean() {
        int[] checkBalance = {2, 2, 2, 1, 2, 2, 10, 1};
        int sum = 0;
        for (int i = 0; i < checkBalance.length; i++) {
            sum += checkBalance[i];
        }
        for (int i = 0; i < checkBalance.length; i++) {
            System.out.println(checkBalance[i]);
        }
        System.out.println("Сумма = " + sum);
    }
    /** 8)
     *** Написать метод, которому на вход подается одномерный массив и число n(может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементы массива на n позиций.
     Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     */


}
