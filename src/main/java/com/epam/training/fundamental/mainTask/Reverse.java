package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter the string");
            StringBuilder string = new StringBuilder(scan.nextLine());
            System.out.println("Reversed string: " + string.reverse());
        }
    }
}