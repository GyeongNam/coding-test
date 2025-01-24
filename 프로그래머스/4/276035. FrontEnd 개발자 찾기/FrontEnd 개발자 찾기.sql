-- 코드를 작성해주세요

SELECT ID,EMAIL,FIRST_NAME,LAST_NAME
FROM DEVELOPERS D, SKILLCODES S
WHERE 
    (D.SKILL_CODE & S.CODE) > 0
    AND CATEGORY = 'Front End'
GROUP BY ID, EMAIL, FIRST_NAME, LAST_NAME
ORDER BY ID;