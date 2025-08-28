/* Write your PL/SQL query statement below */
select project_id
     , round(avg(emp.experience_years), 2) as average_years
from Project prj
inner join Employee emp
    on prj.employee_id = emp.employee_id
group by project_id
;