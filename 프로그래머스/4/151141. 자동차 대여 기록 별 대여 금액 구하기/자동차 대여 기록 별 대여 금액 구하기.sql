-- 코드를 입력하세요
# SELECT
# B.HISTORY_ID,
# IF(DATEDIFF(B.END_DATE,B.START_DATE) >= 7,
#     ROUND(A.DAILY_FEE * DATEDIFF(B.END_DATE ,B.START_DATE)*(100-C.DISCOUNT_RATE)/100)
# ,
#     A.DAILY_FEE * DATEDIFF(B.END_DATE ,B.START_DATE)
# )
# AS FEE
# FROM CAR_RENTAL_COMPANY_CAR AS A
# JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS B
# ON A.CAR_ID = B.CAR_ID
# JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN  AS C
# ON A.CAR_TYPE = C.CAR_TYPE
# WHERE A.CAR_TYPE = '트럭'
# GROUP BY B.HISTORY_ID
# ORDER BY FEE DESC, HISTORY_ID DESC

WITH value AS (
    SELECT car.daily_fee, car.car_type, his.history_id,
           DATEDIFF(end_date, start_date) + 1 AS period,
    CASE 
      WHEN DATEDIFF(end_date, start_date) + 1 >= 90 THEN '90일 이상'
      WHEN DATEDIFF(end_date, start_date) + 1 >= 30 THEN '30일 이상'
      WHEN DATEDIFF(end_date, start_date) + 1 >= 7 THEN '7일 이상'
      ELSE 'NONE' END AS duration_type
FROM car_rental_company_rental_history AS his
INNER JOIN car_rental_company_car AS car ON car.car_id = his.car_id
WHERE car.car_type = '트럭')   

SELECT value.history_id, 
    ROUND(value.daily_fee * value.period * 
          (100 - IFNULL(plan.discount_rate,0)) / 100) AS FEE
FROM value
LEFT JOIN car_rental_company_discount_plan AS plan 
    ON plan.duration_type = value.duration_type 
    AND plan.car_type = value.car_type
ORDER BY 2 DESC, 1 DESC