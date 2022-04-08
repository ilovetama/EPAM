package main.java.com.epam.training.fundamental.optionalTask1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        String[] emptyArray = getArraySize();
        String[] filledArray = fillArray(emptyArray);
        printAscendingSortedArray(filledArray);
        printDescendingSortedArray(filledArray);
    }

    private static String[] getArraySize() {
        System.out.println("Please enter the quantity of numbers");
        Scanner scanQuantity = new Scanner(System.in);
        int quantityOfNumbers = scanQuantity.nextInt();
        return new String[quantityOfNumbers];
    }

    private static String[] fillArray(String[] array) {
        System.out.println("Please enter the numbers");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextLine();
        }
        return array;
    }

    private static void printAscendingSortedArray(String[] filledArray) {
        Arrays.sort(filledArray);
        System.out.println("Sort ascending: " + Arrays.toString(filledArray));
    }

    private static void printDescendingSortedArray(String[] filledArray) {
        Arrays.sort(filledArray, Collections.reverseOrder());
        System.out.println("Sort descending: " + Arrays.toString(filledArray));
    }
}

