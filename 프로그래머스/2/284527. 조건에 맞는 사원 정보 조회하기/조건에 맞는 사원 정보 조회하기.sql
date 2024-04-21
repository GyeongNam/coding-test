-- 코드를 작성해주세요
select 
sum(hg.SCORE) as SCORE,
he.EMP_NO, 
he.EMP_NAME, 
he.POSITION, 
he.EMAIL
from HR_EMPLOYEES he
left join HR_GRADE hg
on he.EMP_NO = hg.EMP_NO
group by he.EMP_NO
order by SCORE desc
limit 1
