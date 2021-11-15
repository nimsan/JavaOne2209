package Lesson2;

public class SwitchApp {

    public static void main(String[] args) {
        printMonthNameOld(3);
        printMonthName(1);
        printTimeOfTheYear("Feb");
        printTimeOfTheYear("May");

    }
    /**
     * напечатает название месяца или скажет что такого нет.
     *
     * @param monthNumber - номер месяца
     */
    public static void printMonthNameOld(int monthNumber) {
        if (monthNumber == 1) {
            System.out.println("Jan");
        }
        else if (monthNumber == 2) {
        System.out.println("Feb");
        }
        else {
            System.out.println("No such month");
        }
    }
    public static void printMonthName(int monthNumber) {
        switch (monthNumber){
            case 1:{
            System.out.println("Jan");
            break;
            }
            case 2: {
                System.out.println("Feb");
                break;
            }
            default:
                System.out.println("No such month");
        }
    }
    public static void printTimeOfTheYear (String monthName){
        switch (monthName){
            case "Dec":
            case "Jan":
            case "Feb": {
                System.out.println("Winter");
            break;
            }
            case "Mart":
            case "Apr":
            case "May": {
                System.out.println("Spring");
            break;
            }
            default:
                System.out.println("No such time of the year");


        }


    }

}
