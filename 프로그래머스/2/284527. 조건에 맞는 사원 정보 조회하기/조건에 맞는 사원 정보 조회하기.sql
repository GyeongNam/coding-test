-- 코드를 작성해주세요
# select 
# sum(hg.SCORE) as SCORE,
# he.EMP_NO, 
# he.EMP_NAME, 
# he.POSITION, 
# he.EMAIL
# from HR_EMPLOYEES he
# left join HR_GRADE hg
# on he.EMP_NO = hg.EMP_NO
# group by he.EMP_NO
# order by SCORE desc
# limit 1

SELECT SUM(SCORE) AS SCORE, EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_EMPLOYEES E 
JOIN HR_GRADE G USING (EMP_NO)
GROUP BY EMP_NO
ORDER BY SCORE DESC
LIMIT 1
