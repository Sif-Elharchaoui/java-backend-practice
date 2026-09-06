package projects.librarysystem;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Sif", 101);

        System.out.println("=== Attempt 1: borrow an existing, available book ===");
        try {
            Loan loan1 = library.borrowBook("Clean Code", member1, "2026-09-04");
            loan1.printLoanInfo();
        } catch (BookNotFoundException | BookUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Attempt 2: try borrowing the SAME book again (should fail) ===");
        try {
            library.borrowBook("Clean Code", member1, "2026-09-04");
        } catch (BookNotFoundException | BookUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Attempt 3: try borrowing a book that doesn't exist (should fail) ===");
        try {
            library.borrowBook("Nonexistent Book", member1, "2026-09-04");
        } catch (BookNotFoundException | BookUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Attempt 4: return the book, then confirm it's available again ===");
        try {
            library.returnBook("Clean Code");
            Book checkAgain = library.findBook("Clean Code");
            System.out.println("Available now: " + checkAgain.isAvailable());
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}