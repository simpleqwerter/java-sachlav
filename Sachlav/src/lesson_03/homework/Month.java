package lesson_03.homework;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        System.out.println("input month number 1-12: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("month number 1 - is January. ");
                break;
            case 2:
                System.out.println("month number 2 - is February. ");break;
            case 3:
                System.out.println("month number 3 is March");break;
            case 4:
                System.out.println("month 4 is April.");break;
            case 5:
                System.out.println("mont 5 is May.");break;
            case 6:
                System.out.println("Month 6 is June");break;
            case 7:
                System.out.println("Month 7 is July");break;
            case 8:
                System.out.println("Month 8 is August");break;
            case 9:
                System.out.println("Month 9 is September");break;
            case 10:
                System.out.println("Month 10 is Oktober");break;
            case 11:
                System.out.println("Month 11 is November");break;
            case 12:
                System.out.println("Month 12 is December");break;
            default:
                String text = String.format("There are only 12 month in the year. %s is wrong number", (number));
                System.out.println(text);
        }

    }
}
