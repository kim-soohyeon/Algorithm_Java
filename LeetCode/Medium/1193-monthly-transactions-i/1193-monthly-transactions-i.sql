/* Write your PL/SQL query statement below */
select to_char(trans_date, 'yyyy-mm') as month
    , country
    , count(*) as trans_count
    , sum(decode(state, 'approved', 1, 0)) as approved_count
    , sum(amount) as trans_total_amount
    , sum(decode(state, 'approved', amount , 0)) as approved_total_amount
from Transactions
group by to_char(trans_date, 'yyyy-mm'), country