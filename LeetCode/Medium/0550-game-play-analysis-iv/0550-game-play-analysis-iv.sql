/* Write your PL/SQL query statement below */
select round(count(b.player_id) / count(distinct a.player_id), 2) as fraction 
from Activity a
left outer join (
    select player_id, min(event_date) as min_date
    from Activity
    group by player_id
) b on a.player_id = b.player_id
   and a.event_date = b.min_date + 1
