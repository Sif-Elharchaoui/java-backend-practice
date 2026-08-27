package fundamentals.arrays;

import java.util.Scanner;

public class Matrix2D {

    public static void main(String[] args) {

        int[][] arr = arrReader();

        int sum = diagonalSum(arr);
        System.out.println("Diagonal Sum: " + sum);

        int[][] transposed = transpose(arr);

        System.out.println("Transposed Matrix:");

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int diagonalSum(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        return sum;
    }

    public static int[][] transpose(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }

        return result;
    }

    public static int[][] arrReader() {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
}