/* Write your PL/SQL query statement below */
SELECT PROD.product_name
     , SAL.year
     , SAL.price
FROM Product PROD
INNER JOIN Sales SAL
    ON PROD.product_id = SAL.product_id
;
