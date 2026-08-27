package projects.librarysystem;

public class Loan {

    private Book book;
    private Member member;
    private String borrowDate;

    public Loan(Book book, Member member, String borrowDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;

        book.setAvailable(false);
    }

    public void returnBook() {
        book.setAvailable(true);

        System.out.println(
                book.getTitle() + " returned by " + member.getName()
        );
    }

    public void printLoanInfo() {
        System.out.println(
                member.getName()
                        + " borrowed \""
                        + book.getTitle()
                        + "\" on "
                        + borrowDate
        );
    }
}