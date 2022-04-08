package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class AddMultiply {

    public static void main(String[] args) {

        System.out.println("Please enter the first number");
            Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
        System.out.println("Please enter the second number");
            Scanner scan1 = new Scanner(System.in);
                int y = scan1.nextInt();
                    System.out.println(x + " + " + y + " = " + (x + y));
                    System.out.println(x + " * " + y + " = " + (x * y));
    }
}

