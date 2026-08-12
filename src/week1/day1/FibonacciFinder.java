package week1.day1;

import java.util.Scanner;

public class FibonacciFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(n + "th Fibonacci number: " + b);

        sc.close();
    }
}