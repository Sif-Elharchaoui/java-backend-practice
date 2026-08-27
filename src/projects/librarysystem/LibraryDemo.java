package projects.librarysystem;

public class LibraryDemo {

    public static void main(String[] args) {

        // Create books
        Book book1 = new Book(
                "Clean Code",
                "Robert C. Martin"
        );

        Book book2 = new Book(
                "Effective Java",
                "Joshua Bloch"
        );

        Book book3 = new Book(
                "Java Concurrency in Practice",
                "Brian Goetz"
        );

        // Create members
        Member member1 = new Member("Sif", 101);
        Member member2 = new Member("Ahmed", 102);

        System.out.println("==============================");
        System.out.println("       LIBRARY SYSTEM");
        System.out.println("==============================");

        System.out.println();
        System.out.println("Book: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Available: " + book1.isAvailable());

        // Borrow the book
        System.out.println();
        System.out.println("Creating loan...");

        if (book1.isAvailable()) {

            Loan loan1 = new Loan(
                    book1,
                    member1,
                    "2026-08-23"
            );

            loan1.printLoanInfo();

            System.out.println(
                    "Book available: " + book1.isAvailable()
            );

            // Try borrowing the same book again
            System.out.println();
            System.out.println("Trying to borrow the same book again...");

            if (!book1.isAvailable()) {
                System.out.println("Book unavailable.");
            }

            // Return the book
            System.out.println();
            System.out.println("Returning book...");

            loan1.returnBook();

            System.out.println(
                    "Book available: " + book1.isAvailable()
            );
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("          END");
        System.out.println("==============================");
    }
}