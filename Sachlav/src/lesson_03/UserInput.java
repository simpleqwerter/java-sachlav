package lesson_03;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int age;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("what is your name?");
        name = input.next();
        System.out.println("what is your age?");
        age = input.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);

    }
}
