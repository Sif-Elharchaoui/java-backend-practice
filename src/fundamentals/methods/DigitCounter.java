package fundamentals.methods;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int targetDigit = sc.nextInt();
        long number = sc.nextLong();

        int count = 0;

        while (number > 0) {
            long lastDigit = number % 10;

            if (lastDigit == targetDigit) {
                count++;
            }

            number = number / 10;
        }

        System.out.println("The digit " + targetDigit + " appears " + count + " times");

        sc.close();
    }
}