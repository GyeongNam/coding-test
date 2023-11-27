-- 코드를 입력하세요
SELECT
YEAR(SALES_DATE) AS YEAR,
MONTH(SALES_DATE) AS MONTH,
COUNT(DISTINCT B.USER_ID) AS PUCHASED_USERS,
ROUND(COUNT(DISTINCT B.USER_ID) * 1.0 / 
(
    SELECT COUNT(DISTINCT USER_ID)
    FROM USER_INFO
    WHERE YEAR(JOINED) = '2021'
),1) AS PUCHASED_RATIO
FROM USER_INFO AS A
JOIN ONLINE_SALE AS B
ON A.USER_ID = B.USER_ID
WHERE YEAR(JOINED) = '2021'
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH

# select 
# year(sales_date) year,
# month(sales_date) month, 
# count(distinct os.user_id) purchased_users,
# round(count(distinct os.user_id) * 1.0 / (
#     select count(distinct user_id) 
#     from user_info where year(joined) = '2021'),1) purchased_ratio 
# from online_sale os
# join user_info ui
# on os.user_id=ui.user_id
# where year(joined) = '2021'
# group by 1, 2
# order by 1, 2