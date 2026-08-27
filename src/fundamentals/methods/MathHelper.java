package fundamentals.methods;

public class MathHelper {

    public static void main(String[] args) {

        System.out.println("5! = " + factorial(5));
        System.out.println("gcd(48, 18) = " + gcd(48, 18));
        System.out.println("17 is prime: " + isPrime(17));
        System.out.println("18 is prime: " + isPrime(18));
    }

    public static long factorial(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        int c = 2;

        while (c * c <= n) {

            if (n % c == 0) {
                return false;
            }

            c++;
        }

        return true;
    }
}