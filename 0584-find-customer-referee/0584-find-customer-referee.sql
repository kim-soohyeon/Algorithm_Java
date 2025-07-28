/* Write your PL/SQL query statement below */
SELECT name
FROM Customer
WHERE nvl(referee_id, 0) != 2
