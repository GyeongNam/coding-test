-- 코드를 입력하세요
SELECT
CAR_ID,
max(if('2022-10-16' between start_date and end_date, '대여중','대여 가능'))
AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
GROUP BY CAR_ID
ORDER BY CAR_ID DESC