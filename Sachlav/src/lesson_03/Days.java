package lesson_03;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input day number 1-7: ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("day number 1: ");
                break;
            case 2:
                System.out.println("day number 2: ");
                break;
            case 3:
                System.out.println("day number 3: ");
                break;
            case 4:
                System.out.println("day number 4: ");
                break;
            case 5:
                System.out.println("day number 5: ");
                break;
            case 6:
                System.out.println("day number 6: ");
                break;
            case 7:
                System.out.println("day number 7: ");
                break;
            default:
                System.out.println("day number can be only in 1-7: ");

        }


    }
}
