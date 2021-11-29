package Lesson4;

import java.util.Random;
import java.util.Scanner;

// ИГРА КРЕСТИКИ НОЛИКИ
public class CrossesZeroesApp {
    /**
     * ИГРОВАЯ КАРТА
     */
    public static char[][] map;
    /**
     * РАЗМЕР ПОЛЯ
     */
    public static final int SIZE = 3;
    /**
     * Сколько точек надо для победы
     */
    public static final int DOTS_TO_WIN = 3;
    /**
     * Пустая ячейка
     */
    public static final char DOT_EMPTY = '.';
    /**
     * символ игрока
     */
    public static final char DOT_X = 'x';
    /**
     * символ компьютера
     */
    public static final char DOT_0 = '0';

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWi(DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWi(DOT_0)) {
                System.out.println("Комп выиграл");

            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            /** проверка победы с помощью цикла!!!
            * for
            */

        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Инициализирует и заполняет карту пустыми ячейками
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    /**
     * Печатает поле на экран
     */
    public static void printMap() {
        // верхние координаты
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            // левые координаты
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека
     */
    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * Валидна ли ячейка
     */
    public static boolean isCellValid(int x, int y) {
        // проверили что попали в массив
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        // проверим что ячейка подходит
        if (map[x][y] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    // ход компьютера
    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("Робот ходит в точку %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_0;
    }

    /**
     * Проверяет выигрыш.
     *
     * @param sym для проверки победы
     * @return
     */
    public static boolean checkWi(char sym) {
        // горизонтали
        if (map[0][0] == sym && map[0][1] == sym && map[0][2] == sym) {
            return true;
        }
        if (map[1][0] == sym && map[1][1] == sym && map[1][2] == sym) {
            return true;
        }
        if (map[2][0] == sym && map[2][1] == sym && map[2][2] == sym) {
            return true;
        }
        //вертикали
        if (map[0][0] == sym && map[1][0] == sym && map[2][0] == sym) {
            return true;
        }
        if (map[0][1] == sym && map[1][1] == sym && map[2][1] == sym) {
            return true;
        }
        if (map[0][2] == sym && map[1][2] == sym && map[2][2] == sym) {
            return true;
        }
        //диагонали
        if (map[0][0] == sym && map[1][1] == sym && map[2][2] == sym) {
            return true;
        }
        if (map[0][2] == sym && map[1][1] == sym && map[2][0] == sym) {
            return true;
        }
        return false;

    }
}
