package lesson_04.logic_operators;

import java.util.Scanner;

public class WorkersBonus {
    public static void main(String[] args) {
        Scanner inputSalary = new Scanner(System.in);
        Scanner inputExpirience = new Scanner(System.in);
        int salary = -1;
        int expirience = -1;

        while (salary < 0) {
            System.out.println("input your salary");
            salary = inputSalary.nextInt();
        }
        while (expirience < 0) {
            System.out.println("input your expirience");
            expirience = inputExpirience.nextInt();
        }
        double bonus;

        if (expirience < 5) {
            bonus = salary + (salary * 0.05);
        }
        else if (expirience < 10) {
            bonus = salary + (salary * 0.15);
        }
        else if (expirience < 15) {
            bonus = salary + (salary * 0.25);
        }
        else if (expirience < 20) {
            bonus = salary + (salary * 0.35);
        }
        else if (expirience < 25) {
            bonus = salary + (salary * 0.45);
        }
        else {
            bonus = salary + (salary * 0.50);
        }

        System.out.println(bonus);

        }
    }

