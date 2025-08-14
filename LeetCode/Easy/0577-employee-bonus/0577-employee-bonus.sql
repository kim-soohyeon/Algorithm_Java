/* Write your PL/SQL query statement below */
SELECT EMP.name
     , BNS.bonus
FROM Employee EMP
LEFT OUTER JOIN Bonus BNS
    ON EMP.empId = BNS.empId
where NVL(BNS.bonus, 0) < 1000
;    
