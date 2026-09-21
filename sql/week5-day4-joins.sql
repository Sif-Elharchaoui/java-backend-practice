-- INNER JOIN: only rows that match in BOTH tables
SELECT members.name, loans.borrow_date
FROM loans
         INNER JOIN members ON loans.member_id = members.id;

-- LEFT JOIN: all members, loan data if it exists, NULL if not
SELECT members.name, loans.borrow_date
FROM members
         LEFT JOIN loans ON members.id = loans.member_id;

-- Three-table join — mirrors your Loan class's composition (Book + Member)
SELECT members.name, loans.borrow_date, books.title
FROM loans
         INNER JOIN members ON loans.member_id = members.id
         INNER JOIN books ON loans.book_id = books.id;