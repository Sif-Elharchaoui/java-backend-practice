package week1.day4;

import java.util.Arrays;
import java.util.Scanner;

public class GridPrintStyles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        // Style 1: classic indexed loop, printing one row at a time
        for (int row = 0; row < nums.length; row++) {
            System.out.println(Arrays.toString(nums[row]));
        }

        System.out.println("---");

        // Style 2: enhanced for-each, same result, more concise
        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
}