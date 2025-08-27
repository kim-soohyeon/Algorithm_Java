/* Write your PL/SQL query statement below */
select prs.product_id
     , round(sum(prs.price * untsd.units) / sum(untsd.units), 2) as average_price
from Prices prs
left outer join UnitsSold untsd
    on prs.product_id = untsd.product_id
    and untsd.purchase_date between prs.start_date and prs.end_date   
where 1=1
group by prs.product_id