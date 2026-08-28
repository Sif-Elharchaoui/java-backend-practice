package generics.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Top of stack: " + numbers.peek());
        System.out.println("Size: " + numbers.size());

        System.out.println("Popped: " + numbers.pop());
        System.out.println("Popped: " + numbers.pop());
        System.out.println("Size after popping: " + numbers.size());

        Stack<String> names = new Stack<>();
        names.push("Sif");
        names.push("Ahmed");
        System.out.println("Top of names stack: " + names.peek());

        Stack<Integer> emptyStack = new Stack<>();
        try {
            emptyStack.pop();
        } catch (RuntimeException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}