package main.java.com.epam.training.fundamental.mainTask;

import java.util.Objects;
import java.util.Scanner;

public class Random {

    public static void main(String[] args) {

        System.out.println("Please enter the quantity of numbers");
             Scanner scan = new Scanner(System.in);
             int quantityOfNumbers = scan.nextInt();
        System.out.println("Do you need new line? Y/N");
             Scanner scan1 = new Scanner(System.in);
             String answer = scan1.nextLine();
                int min = 0;
                int max = 250;
                for (int i = 0; i < quantityOfNumbers; i++) {
                    int number = (int)(( Math.random() * (max - min + 1) + min));
                    if (Objects.equals(answer, "Y") || Objects.equals(answer, "y"))
                System.out.println(number);
                    else
                System.out.print(number + " ");
        }
    }
}




