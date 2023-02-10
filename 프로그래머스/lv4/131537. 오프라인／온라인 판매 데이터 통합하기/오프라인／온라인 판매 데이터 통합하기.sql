-- 코드를 입력하세요
SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE
     , PRODUCT_ID
     , USER_ID
     , SALES_AMOUNT
FROM (
    SELECT SALES_DATE
         , PRODUCT_ID
         , USER_ID
         , SALES_AMOUNT
    FROM ONLINE_SALE --온라인 상품 판매 정보
    UNION ALL
    SELECT SALES_DATE
         , PRODUCT_ID
         , NULL AS USER_ID
         , SALES_AMOUNT
    FROM OFFLINE_SALE --오프라인 상품 판매 정보
)
WHERE TO_CHAR(SALES_DATE, 'YYYYMM') = '202203'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID
