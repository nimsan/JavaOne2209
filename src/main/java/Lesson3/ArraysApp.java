package Lesson3;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[3]=5;
        intArray[1]=0;
        intArray[0]=3;
        System.out.println(intArray[1]);

        for (int i=0; i< intArray.length; i++){
            int value = intArray[i];
            System.out.println("intArray ["+i+"] = " +value);
        }
        int[] arr1 = new int [10];
        for (int i = 0; i< arr1.length; i++){
            arr1[i] = i*10;
        }
        for (int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

// чтобы вывести на экран массив нужно написать не System.out.println(arr1); а см.ниже
        System.out.println(Arrays.toString(arr1));
// чтобы вывести на экран массив с одинаковым значением, в данном случае 5. см.ниже
        int[] teenArray = new int[10];
        Arrays.fill(teenArray, 5);
        System.out.println(Arrays.toString(teenArray));

        System.out.println();//пробел

        System.out.println(Arrays.toString(creatArrayAndFilIt(8,42)));
        System.out.println(Arrays.toString(creatArrayAndFilIt(5,55)));


        System.out.println();//пробел

        //массив типа boolean
        boolean[ ] boolArray = new boolean[5];
        boolArray[2] =true;
        //Arrays.fill(boolArray, true);
        System.out.println(Arrays.toString(boolArray));

        System.out.println();//пробел

        //массив типа String
        String[] strings = new String[5];
        Arrays.fill(strings, "Default Value");// если это не задавать значение, то выведется null;
        System.out.println(Arrays.toString(strings));

        System.out.println();//пробел

        //массив с явным указанием элементов длиной 3
        int[] exampleArr = new int[] {9,8,7,6,5,5,4,3,2,1,1,4};
        System.out.println(Arrays.toString(exampleArr));
        Arrays.sort(exampleArr);// сортировка по возрастанию!!!
        System.out.println(Arrays.toString(exampleArr));
        //Last element
        System.out.println(exampleArr[exampleArr.length-1]);// чтобы обратиться к последнему элементу пишем


    }
    public static int[ ] creatArrayAndFilIt (int lenght, int valueToFill){
        int[ ] result = new int [lenght];
        Arrays.fill(result,valueToFill);
        return result;




    }

}






