package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter your name");
            System.out.println("Hello " + scan.nextLine() + "!");
        }
    }
}