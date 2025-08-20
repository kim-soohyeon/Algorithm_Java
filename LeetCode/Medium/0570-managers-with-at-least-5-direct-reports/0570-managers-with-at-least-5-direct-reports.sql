/* Write your PL/SQL query statement below */
select mng.name
from Employee mng
inner join Employee emp
    on mng.id = emp.managerId
group by mng.id, mng.name
having count(*) >= 5
;