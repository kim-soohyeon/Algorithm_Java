/* Write your PL/SQL query statement below */
SELECT author_id AS id
FROM Views
WHERE 1=1
    AND author_id  = viewer_id
GROUP BY author_id    
ORDER BY id
;
-- 자신의 기사를 하나라도 본 모든 작성자를