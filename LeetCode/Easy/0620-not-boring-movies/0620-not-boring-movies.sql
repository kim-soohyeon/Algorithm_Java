/* Write your PL/SQL query statement below */
select id
     , movie
     , description
     , rating
from Cinema
where description <> 'boring'
    and MOD(id, 2) <> 0
order by rating desc;