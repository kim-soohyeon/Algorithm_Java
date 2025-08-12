/* Write your PL/SQL query statement below */
SELECT ACT1.machine_id
     , ROUND(AVG(ACT2.timestamp - ACT1.timestamp), 3) AS processing_time
FROM Activity ACT1
INNER JOIN Activity ACT2
    ON ACT1.machine_id = ACT2.machine_id
    AND ACT1.process_id = ACT2.process_id
    AND ACT2.activity_type = 'end'
WHERE ACT1.activity_type = 'start'
GROUP BY ACT1.machine_id
