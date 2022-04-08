package main.java.com.epam.training.classes.mainTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Shop {

    private final String shopName;
    private final ArrayList<Customer> customersList = new ArrayList<>();

    Shop(String shopName) {
        this.shopName = shopName;
    }

    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    public List<Customer> sortByName() {
        List<Customer> list = new ArrayList<>(customersList);
        list.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        return list;
    }

    public void printSortedList(List<Customer> list) {
        System.out.println("_________________");
        list.forEach(System.out::println);
        System.out.println("_________________");
    }

    private long getMinOfCardNumber(){
        System.out.println("Enter minimum value for credit card number:");
        return new Scanner(System.in).nextLong();
    }

    private long getMaxOfCardNumber() {
        System.out.println("Enter maximum value for credit card number:");
        return new Scanner(System.in).nextLong();
    }

    public List<Customer> sortBySurname() {
        List<Customer> list = new ArrayList<>(customersList);
        list.sort((a1, a2) -> a1.getSurname().compareToIgnoreCase(a2.getSurname()));
        return list;
    }

    public List<Customer> sortByCardNumber() {
        long min = getMinOfCardNumber();
        long max = getMaxOfCardNumber();
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getCardNumber() >= min && c.getCardNumber() <= max) {
                list.add(c);
            }
        }
        return list;
    }
}
