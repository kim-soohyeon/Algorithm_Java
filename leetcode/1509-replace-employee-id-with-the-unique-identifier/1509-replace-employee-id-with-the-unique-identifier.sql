/* Write your PL/SQL query statement below */
select empUni.unique_id
     , emp.name
from Employees emp
left outer join EmployeeUNI empUni
    on emp.id = empUni.id
;