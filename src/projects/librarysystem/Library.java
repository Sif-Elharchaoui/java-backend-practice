package projects.librarysystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Library {
    private HashMap<String, Book> catalog;
    private List<Loan> activeLoans;

    public Library() {
        catalog = new HashMap<>();
        activeLoans = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.put(book.getTitle(), book);
    }

    public Book findBook(String title) throws BookNotFoundException {
        Book book = catalog.get(title);
        if (book == null) {
            throw new BookNotFoundException("No book found with title: " + title);
        }
        return book;
    }

    public Loan borrowBook(String title, Member member, String date)
            throws BookNotFoundException, BookUnavailableException {
        Book book = findBook(title);
        if (!book.isAvailable()) {
            throw new BookUnavailableException("Book is currently unavailable: " + title);
        }
        Loan loan = new Loan(book, member, date);
        activeLoans.add(loan);
        return loan;
    }

    public void returnBook(String title) throws BookNotFoundException {
        Iterator<Loan> it = activeLoans.iterator();
        while (it.hasNext()) {
            Loan loan = it.next();
            if (loan.getBook().getTitle().equals(title)) {
                loan.returnBook();
                it.remove();
                return;
            }
        }
        throw new BookNotFoundException("No active loan found for: " + title);
    }
}