package fundamentals.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the operator: ");
                char operator = sc.next().trim().charAt(0);

                if (operator == 'x' || operator == 'X') {
                    break;
                }

                if (operator != '+' && operator != '-' && operator != '*'
                        && operator != '/' && operator != '%') {
                    System.out.println("Invalid operation!!");
                    continue;
                }

                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                switch (operator) {
                    case '+' -> System.out.println(num1 + num2);
                    case '-' -> System.out.println(num1 - num2);
                    case '*' -> System.out.println(num1 * num2);
                    case '/' -> System.out.println(num1 / num2);
                    case '%' -> System.out.println(num1 % num2);
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: please enter valid numbers.");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: cannot divide by zero.");
            } finally {
                System.out.println("--- attempt finished ---");
            }
        }

        sc.close();
        System.out.println("Calculator closed.");
    }
}