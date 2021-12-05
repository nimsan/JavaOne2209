package Lesson7;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {
        String string = "Java";
        String string2 = new String("Java");
        String string3 = new String(new char[]{'j', 'a', 'v', 'a'});

        String string4 = "Java";

        System.out.println(string == string4);
        System.out.println(string == string2);
        System.out.println();

        System.out.println(string.equals(string2));

        System.out.println(string.length());
        System.out.println(string.charAt(0));
        System.out.println(Arrays.toString(string.toCharArray()));
        System.out.println(string.equalsIgnoreCase(string3));

        System.out.println(string.concat(string2));
        System.out.println(string.toUpperCase());//JAVA

        //
        System.out.println(string);//Java

        //string = string.toUpperCase();

        String s = String.valueOf(100);
        System.out.println(s);

        String s2=1+2+"A";
        String s3="A"+1+2;
        System.out.println(s2+" "+s3);

        StringBuilder sd = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        sd.append("s1");
        sd.append("s2");
        sd.append("a1").append(10).append("a2").append(true);

        //sd.reverse();//реверс, выводит задом наперед

        System.out.println(sd);
        String stringFormSB = sd.toString();



    }
}
