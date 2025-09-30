/* Write your PL/SQL query statement below */
select to_char(activity_date, 'yyyy-mm-dd') as day
    , count(distinct user_id) as active_users 
from Activity
where 1=1
    and abs(to_date('2019-07-27') - activity_date) < 30 
    and activity_date <= '2019-07-27' 
group by activity_date