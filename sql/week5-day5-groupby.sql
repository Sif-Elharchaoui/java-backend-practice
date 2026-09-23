-- Count how many books each member has borrowed
SELECT member_id, COUNT(*) AS books_borrowed
FROM loans
GROUP BY member_id;

-- Total value of books per category
SELECT category, SUM(price) AS total_value
FROM books
GROUP BY category;

-- Average book price per category, highest first
SELECT category, AVG(price) AS avg_price
FROM books
GROUP BY category
ORDER BY avg_price DESC;

-- Members ranked by how much they borrow
SELECT member_id, COUNT(*) AS books_borrowed
FROM loans
GROUP BY member_id
ORDER BY books_borrowed DESC;