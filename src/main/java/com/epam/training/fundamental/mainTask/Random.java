package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class Random {

    public static void main(String[] args) {

        int min = getMin();
        int max = getMax();
        int quantityOfNumbers = getQuantityOfNumbers();
        String lineOrRow = lineOrRow();
        result(quantityOfNumbers, lineOrRow, min, max);
    }

    private static int getQuantityOfNumbers() {
        System.out.println("Please enter the quantity of numbers");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static String lineOrRow() {
        System.out.println("Do you need result in line(L) or row(R)?");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static int getMin() {
        System.out.println("Please enter minimum value");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static int getMax() {
        System.out.println("Please enter maximum value");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static void result(int quantityOfNumbers, String answer, int min, int max) {
        for (int i = 0; i < quantityOfNumbers; i++) {
            int number = (int) ((Math.random() * (max - min + 1) + min));
            switch (answer) {
                case "R", "r" -> System.out.println(number);
                case "L", "l" -> System.out.print(number + " ");
                default -> {
                    System.out.println("Please enter 'L' or 'R'");
                    System.exit(0);
                }
            }
        }
    }
}




