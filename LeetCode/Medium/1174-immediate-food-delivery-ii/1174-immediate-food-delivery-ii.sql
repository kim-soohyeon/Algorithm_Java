/* Write your PL/SQL query statement below */
select round(sum(decode(order_date, customer_pref_delivery_date, 1, 0)) / count(*) * 100, 2) as immediate_percentage 
from (
    
    select customer_id, order_date, customer_pref_delivery_date 
        , rank() over (partition by customer_id order by order_date) as rnk
    from Delivery
)    
where 1=1
    and rnk = 1
;