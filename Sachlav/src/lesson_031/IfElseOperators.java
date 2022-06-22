package lesson_031;

import java.util.Scanner;

public class IfElseOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number ");

        int number = input.nextInt();

        if (number % 2 == 1) {
            System.out.println("number " + (number) + " is not odd");
        }
        else {
            System.out.println("number " + (number) + " is  odd");
        }
    }
}
