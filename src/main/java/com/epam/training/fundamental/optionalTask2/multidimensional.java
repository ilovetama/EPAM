package main.java.com.epam.training.fundamental.optionalTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multidimensional {

    public static void main(String[] args) {

        List<Integer> parameters = getMatrixParameters();
        int d = getColumnOrRowNumber();
        int[][] array = fillMatrix(parameters);
        Singleton singleton = Singleton.getInstance(array);
        sortColumnDescending(singleton.value, d);
        sortColumnAscending(singleton.value, d);
        sortRowDescending(singleton.value, d);
        sortRowAscending(singleton.value, d);
    }

    private static int getColumnOrRowNumber(){
        System.out.println("Please enter column or row");
        return new Scanner(System.in).nextInt();
    }

    private static List<Integer> getMatrixParameters() {
        List<Integer> parameters = new ArrayList<>();
        System.out.println("Please enter the number of columns");
        int column = new Scanner(System.in).nextInt();
        parameters.add(column);
        System.out.println("Please enter the number of rows");
        int row = new Scanner(System.in).nextInt();
        parameters.add(row);
        System.out.println("Please enter M");
        int m = new Scanner(System.in).nextInt();
        parameters.add(m);
        return parameters;
    }

    private static int[][] fillMatrix(List<Integer> parameters) {
        int row = parameters.get(0);
        int column = parameters.get(1);
        int m = parameters.get(2);
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int r = -m + (int) (Math.random() * (2 * m + 1));
                matrix[i][j] = r;
            }
        }
        return matrix;
    }

    private static void sortColumnAscending(int[][] matrix, int d) {

        System.out.println("Original matrix");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%4d ", anInt);
            }
            System.out.println();
        }
        System.out.println();
        d--;
        for (int i = 0; i < matrix.length; i++)
            for (int k = i + 1; k < matrix.length; k++) {
                if (matrix[i][d] > matrix[k][d]) {
                    for (int j = 0; j < matrix.length; j++) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        System.out.println("Sorted ascending by " + (d + 1) + " column");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d ", ints[j]);
            }
            System.out.println();
        }
    }

    private static void sortColumnDescending(int[][] matrix, int d) {

        System.out.println("Original matrix");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%4d ", anInt);
            }
            System.out.println();
        }
        System.out.println();
        d--;
        for (int i = 0; i < matrix.length; i++)
            for (int k = i + 1; k < matrix.length; k++) {
                if (matrix[i][d] < matrix[k][d]) {
                    for (int j = 0; j < matrix.length; j++) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        System.out.println("Sorted descending by " + (d + 1) + " column");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d ", ints[j]);
            }
            System.out.println();
        }
    }

    private static void sortRowDescending(int[][] matrix, int d) {

        System.out.println("Original matrix");
        for (int[] value : matrix) {
            for (int i : value) {
                System.out.printf("%4d ", i);
            }
            System.out.println();
        }
        System.out.println();
        d--;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length - 1; k++) {
                if (matrix[d][k + 1] > matrix[d][k]) {
                    for (int j = 0; j < matrix.length; j++) {
                        int temp = matrix[j][k];
                        matrix[j][k] = matrix[j][k + 1];
                        matrix[j][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted descending by " + (d + 1) + " row");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d ", ints[j]);
            }
            System.out.println();
        }
    }

    private static void sortRowAscending(int[][] matrix, int d) {

        System.out.println("Original matrix");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%4d ", anInt);
            }
            System.out.println();
        }
        System.out.println();
        d--;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length - 1; k++) {
                if (matrix[d][k + 1] < matrix[d][k]) {
                    for (int j = 0; j < matrix.length; j++) {
                        int temp = matrix[j][k];
                        matrix[j][k] = matrix[j][k + 1];
                        matrix[j][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted ascending by " + (d + 1) + " row");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d ", ints[j]);
            }
            System.out.println();
        }
    }
}




