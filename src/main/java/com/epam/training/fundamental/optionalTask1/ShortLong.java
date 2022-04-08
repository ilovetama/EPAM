package main.java.com.epam.training.fundamental.optionalTask1;

import java.util.Scanner;

public class ShortLong {

    public static void main(String[] args) {

        System.out.println("Please enter the numbers");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longWord = "", shortWord = line;
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println("The longest number is " + longWord +". The length is " + longWord.length());
        System.out.println("The shortest number is " + shortWord + ". The length is " + shortWord.length());
    }
}