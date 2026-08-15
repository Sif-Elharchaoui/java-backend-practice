package week1.day4;

import java.util.Arrays;
import java.util.Scanner;

public class GridStats {
    public static void main(String[] args) {
        int[][] arr = readArr();
        printGrid(arr);
        int[] sums = rowSums(arr);
        System.out.println(Arrays.toString(sums));
    }

    public static int[][] readArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value of [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printGrid(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static int[] rowSums(int[][] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            result[i] = total;
        }
        return result;
    }
}