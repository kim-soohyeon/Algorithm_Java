/* Write your PL/SQL query statement below */
SELECT prev.id 
FROM Weather prev
LEFT OUTER JOIN Weather yDay
    on prev.recordDate = yDay.recordDate + 1
WHERE prev.temperature > yDay.temperature