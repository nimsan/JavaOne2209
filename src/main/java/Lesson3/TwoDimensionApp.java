package Lesson3;

import java.util.Arrays;
// ДВУМЕРНЫЙ МАССИВ
public class TwoDimensionApp {
    public static void main(String[] args) {
        int[][] twoDinArray = new int[7][8];
        twoDinArray [1][1]=10;
        twoDinArray [6][7]=42;
        System.out.println(Arrays.toString(twoDinArray));

        for (int i=0; i< twoDinArray.length; i++){
            for (int j=0; j<twoDinArray[i].length; j++){
                System.out.print(twoDinArray[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();//пробел
        // тоже самое но только по другому
        for ( int i=0; i<twoDinArray.length;i++){
            //Arrays.fill(twoDinArray[i], i); //автоматическое заполнение
            System.out.println(Arrays.toString(twoDinArray[i]));
        }
        System.out.println();//пробел
        //Массив это ссылочный тип, поэтому null
        int[][] nonFixedArray = new int[3][];
        System.out.println(Arrays.toString(nonFixedArray));


        System.out.println();//пробел
        //Массив это ссылочный тип, поэтому null
        int[][] nonFixedArray1 = new int[3][];
        nonFixedArray1 [0] = new int[]{1,2,3};
        nonFixedArray1 [1] = new int[]{1,2,3,4,5};
        nonFixedArray1 [2] = new int[]{1,2,3,4,5,6,7};
        for (int i=0; i<nonFixedArray1.length; i++) {
            System.out.println(Arrays.toString(nonFixedArray1[i]));
        }
    }

}


