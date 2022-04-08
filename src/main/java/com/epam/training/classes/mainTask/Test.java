package main.java.com.epam.training.classes.mainTask;

public class Test {
    public static void main(String[] args) {

        Shop shop = new Shop("shop");
        UserCreator userCreator = new UserCreator();
        userCreator.createUser(shop);
        System.out.println("Alphabetically sorted by name:");
        shop.printSortedList(shop.sortByName());
        System.out.println("Alphabetically sorted by surname:");
        shop.printSortedList(shop.sortBySurname());
        shop.printSortedList(shop.sortByCardNumber());
    }
}

