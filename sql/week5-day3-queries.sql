-- SELECT: choose which columns you want
SELECT * FROM books;
SELECT title, author FROM books;

-- WHERE: filter rows
SELECT title, author FROM books WHERE available = true;
SELECT * FROM books WHERE available = true AND author = 'Robert Martin';

-- ORDER BY: sort results
SELECT title, author FROM books ORDER BY title ASC;
SELECT title, author FROM books WHERE available = true ORDER BY title DESC;

-- Applied to your actual Library System's data model,
-- if Book/Member were real database tables instead of Java objects:
SELECT title FROM books WHERE available = true ORDER BY title ASC;
SELECT name FROM members WHERE member_id > 100;
