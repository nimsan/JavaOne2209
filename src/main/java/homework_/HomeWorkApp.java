package homework_;

public class HomeWorkApp {
    public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
    }
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -4;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0){
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int value = 110;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
      int a = 5;
      int b = 7;
      if (a >= b) {
          System.out.println("a>=b");
      }
      if (a < b) {
          System.out.println("a<b");
      }


    }
}