package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        // Read 5 numbers from the user
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Get the results from our helper methods
        int maximum = max(nums);
        int minimum = min(nums);
        int sum = sum(nums);

        // Reverse the original array in place
        reverseInPlace(nums);

        System.out.println("Max: " + maximum);
        System.out.println("Min: " + minimum);
        System.out.println("Sum: " + sum);
        System.out.println("Reversed: " + Arrays.toString(nums));

        sc.close();
    }

    // Reverses the array by swapping elements from both ends
    public static void reverseInPlace(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    // Finds the largest number in the array
    public static int max(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        return max;
    }

    // Finds the smallest number in the array
    public static int min(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        return min;
    }

    // Calculates the total of all elements
    public static int sum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}