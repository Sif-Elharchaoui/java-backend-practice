package week1.day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator: ");
            char operator = sc.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*'
                    || operator == '/' || operator == '%') {

                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (operator == '+') {
                    System.out.println(num1 + num2);
                } else if (operator == '-') {
                    System.out.println(num1 - num2);
                } else if (operator == '*') {
                    System.out.println(num1 * num2);
                } else if (operator == '/') {
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("Error: cannot divide by zero");
                    }
                } else {
                    System.out.println(num1 % num2);
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
        }

        sc.close();
    }
}