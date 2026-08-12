package week1.day1;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 42;
        int c = 27;
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Largest: " + max);
    }
}