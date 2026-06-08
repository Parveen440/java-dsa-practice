-- LeetCode 182: Duplicate Emails
-- Topic: GROUP BY, HAVING

SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;