package main.java.com.epam.training.fundamental.optionalTask2;

public class Singleton {

    private static Singleton instance;
    public int[][] value;

    private Singleton(int[][] value) {
        this.value = value;
    }

    public static Singleton getInstance(int[][] value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
