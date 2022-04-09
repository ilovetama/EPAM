package main.java.com.epam.training.fundamental.optionalTask1;

import java.util.Scanner;

public class ShortLong {

    public static void main(String[] args) {

        String line = setNumbers();
        String[] array = compareLines(line);
        printResult(array);
    }

    private static String setNumbers() {
        System.out.println("Please enter the numbers");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static String[] compareLines(String line) {
        String longWord = "", shortWord = line;
        String[] array = new String[2];
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) {
                longWord = s;
                array[0] = longWord;
            }
            if (s.length() < shortWord.length()) {
                shortWord = s;
                array[1] = shortWord;
            }
        }
        return array;
    }

    private static void printResult(String[] array) {
        String longWord = array[0];
        String shortWord = array[1];
        System.out.println("The longest number is " + longWord + ". The length is " + longWord.length());
        System.out.println("The shortest number is " + shortWord + ". The length is " + shortWord.length());
    }
}