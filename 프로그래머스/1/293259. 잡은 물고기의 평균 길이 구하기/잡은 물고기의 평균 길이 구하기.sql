-- 코드를 작성해주세요
select round(avg(IF(length IS NULL, 10, length)),2) as AVERAGE_LENGTH
from FISH_INFO
