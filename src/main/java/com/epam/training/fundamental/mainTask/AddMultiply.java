package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class AddMultiply {

    public static void main(String[] args) {
        int x = getFirstNumber();
        int y = getSecondNumber();
        addition(x, y);
        multiplication(x, y);
    }

    private static int getFirstNumber() {
        System.out.println("Please enter the first number:");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static int getSecondNumber() {
        System.out.println("Please enter the second number:");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static void addition(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    private static void multiplication(int x, int y) {
        System.out.println(x + " * " + y + " = " + (x * y));
    }
}

