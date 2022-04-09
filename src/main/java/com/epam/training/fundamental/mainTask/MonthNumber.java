package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class MonthNumber {

    public static void main(String[] args) {

        int month = setMonth();
        getMonth(month);
    }

    private static void getMonth(int monthNumber) {
        String[] month = {"'January'", "'February'", "'March'", "'April'", "'May'", "'June'",
                "'Jule'", "'August'", "'September'", "'October'", "'November'", "'December'"};
        try {
            String currentMonth = month[monthNumber - 1];
            System.out.println("Your month is " + currentMonth);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry, such month doesn`t exist");
        }
    }

    private static int setMonth() {
        System.out.println("Please enter the number of the month:");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}

