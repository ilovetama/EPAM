package main.java.com.epam.training.fundamental.mainTask;

import java.util.Scanner;

public class MonthNumber {

    static void setMonth(int monthNumber) {
            String[] month = {"January", "February", "March", "April", "May", "June",
                    "Jule", "August", "September", "October", "November", "December"};
            String currentMonth;
                try {
                    currentMonth = month[monthNumber - 1];
                        System.out.println("Your month is " + currentMonth);
                    }
                catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry, such month doesn`t exist");
            }
        }

    public static void main(String[] args) {
       System.out.println("Please enter the number of the month");
            Scanner scan = new Scanner(System.in);
            setMonth(scan.nextInt());
    }
}

