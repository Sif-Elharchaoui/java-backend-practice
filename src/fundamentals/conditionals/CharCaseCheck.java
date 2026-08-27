package fundamentals.conditionals;

public class CharCaseCheck {
    public static void main(String[] args) {
        String input = "gT";
        char ch = input.charAt(1);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Not a letter");
        }
    }
}