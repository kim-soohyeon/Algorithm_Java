-- 코드를 입력하세요
SELECT T01.REST_ID
     , T01.REST_NAME
     , T01.FOOD_TYPE
     , T01.FAVORITES
     , T01.ADDRESS
     , ROUND(AVG(T02.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO T01
INNER JOIN REST_REVIEW T02
ON T01.REST_ID = T02.REST_ID
WHERE T01.ADDRESS LIKE '서울%'
GROUP BY T01.REST_ID, T01.REST_NAME, T01.FOOD_TYPE, T01.FAVORITES, T01.ADDRESS
ORDER BY SCORE DESC, FAVORITES DESC