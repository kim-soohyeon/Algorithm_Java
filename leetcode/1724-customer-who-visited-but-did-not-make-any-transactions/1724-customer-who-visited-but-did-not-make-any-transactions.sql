/* Write your PL/SQL query statement below */
SELECT VST.customer_id
     , COUNT(VST.customer_id) count_no_trans 
FROM Visits VST
LEFT OUTER JOIN Transactions TRNS
    ON VST.visit_id = TRNS.visit_id
WHERE TRNS.visit_id IS NULL
GROUP BY VST.customer_id
ORDER BY count_no_trans
;

