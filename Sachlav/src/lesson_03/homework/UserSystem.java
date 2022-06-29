package lesson_03.homework;

import java.util.Objects;
import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@ssword";
        System.out.println("input your login");

        Scanner input = new Scanner(System.in);
        String userLogin = input.next();
        if (!Objects.equals(userLogin, login)) {
            System.out.println("There is no user with that login");
        }
        System.out.println("input your pass");
        String userPassword = input.next();
        if (!Objects.equals(userPassword, password)) {
            System.out.println("There is no user with that password");
        }
        else {
            System.out.println("welcome back " + login + " .You Sign in");
        }

    }
}
