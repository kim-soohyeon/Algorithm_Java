SELECT TO_CHAR(DATETIME, 'HH24') / 1
    , COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE TO_CHAR(DATETIME, 'HH24') BETWEEN 9 AND 19
GROUP BY TO_CHAR(DATETIME, 'HH24')
ORDER BY 1
;