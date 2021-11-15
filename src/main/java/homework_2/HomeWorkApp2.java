package homework_2;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        boolean result = within10and20 (5, 12);
        System.out.println(result);

        isPositiveOrNegative (-9);
        boolean results = isNegative (2);
        System.out.println(results);

        methodStringAndInt ("mamba", 10);

        boolean res = methodYears (2028);
        System.out.println(res);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void isPositiveOrNegative(int x) {
        if ( x >= 0) {
            System.out.println("число положительное");
        }
        else {
            System.out.println("число отрицательное");
        }
    }
    public static boolean isNegative (int x) {
        if (x < 0) {
        return true;}
        else {
        return false;}
    }

    public static void methodStringAndInt (String a, int i){
        for (i=0; i<=10; i++) {
            System.out.println(a);
        }

    }

    /* (5)
     * Написать метод, который определяет,
     * является ли год високосным, и возвращает
     * boolean (високосный - true, не високосный
     * - false). Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый
     * 400-й – високосный.
     */
    public static boolean methodYears (int x) {
        if ((x % 4 == 0) && (x%100!=0) || (x%400==0)) {
            return true;}
        else {
            return false;}

    }
}
