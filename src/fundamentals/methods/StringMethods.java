package fundamentals.methods;

public class StringMethods {

    public static void main(String[] args) {

        System.out.println("Reversed: " + reverse("hello"));
        System.out.println("racecar is palindrome: " + isPalindrome("racecar"));
        System.out.println("hello is palindrome: " + isPalindrome("hello"));
    }

    public static String reverse(String input) {

        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        return result;
    }

    public static boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}