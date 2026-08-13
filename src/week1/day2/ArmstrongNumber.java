package week1.day2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)){
            System.out.println(n + " is armstrong number");
        }
        else {
            System.out.println(n + " is not armstrong number");
        }
    }

    static boolean isArmstrong(int n) {

        int original = n;
        int number = n;
        int count = 0;
        int sum = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        while (number > 0) {
            int lastDigit = number % 10;

            sum += (int) Math.pow(lastDigit, count);

            number /= 10;
        }

        return sum == original;
    }
}
