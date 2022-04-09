package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        StringBuilder string = setString();
        reverseString(string);
    }

    private static StringBuilder setString() {
        System.out.println("Please enter the string");
        Scanner scan = new Scanner(System.in);
        return new StringBuilder(scan.nextLine());
    }

    private static void reverseString(StringBuilder string) {
        System.out.println("Reversed string: " + string.reverse());
    }
}