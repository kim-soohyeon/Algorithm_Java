/* Write your PL/SQL query statement below */
select sig.user_id
     , case when count(cofrm.user_id) = 0 then 0
            else round(sum(decode(cofrm.action, 'confirmed', 1, 0)) / count(cofrm.user_id), 2)
       end as confirmation_rate
from Signups sig
left outer join Confirmations cofrm
    on sig.user_id = cofrm.user_id
group by sig.user_id
-- , decode(cofrm.action, 'confirmed', 1, 0)
;