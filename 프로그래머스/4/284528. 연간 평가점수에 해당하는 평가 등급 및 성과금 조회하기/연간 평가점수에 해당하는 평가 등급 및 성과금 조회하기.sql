-- 코드를 작성해주세요
WITH A as (
    SELECT EMP_NO,
        CASE
        WHEN AVG(SCORE)>=96 THEN 'S'
        WHEN AVG(SCORE)>=90 AND AVG(SCORE)<96 THEN 'A'
        WHEN AVG(SCORE)>=80 AND AVG(SCORE)<90 THEN 'B'
        ELSE "C"
        END AS GRADE        
    FROM HR_GRADE
    WHERE YEAR=2022
    GROUP BY EMP_NO,YEAR

)

SELECT A.EMP_NO ,E.EMP_NAME ,A.GRADE 
        ,CASE 
        WHEN A.GRADE ='S' THEN E.SAL*0.2
        WHEN A.GRADE ='A' THEN E.SAL*0.15
        WHEN A.GRADE ='B' THEN E.SAL*0.1
        ELSE E.SAL*0
        END AS BONUS
FROM A , HR_EMPLOYEES AS E
WHERE A.EMP_NO=E.EMP_NO
ORDER BY 1;