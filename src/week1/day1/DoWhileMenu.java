package week1.day1;

public class DoWhileMenu {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("Processing...");
            count++;
        } while (count < 3);
        System.out.println("Done after " + count + " runs");
    }
}