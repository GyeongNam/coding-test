-- 코드를 작성해주세요
select 
a.ID,
b.FISH_NAME,
a.LENGTH
from FISH_INFO a
join FISH_NAME_INFO b
on a.FISH_TYPE = b.FISH_TYPE
where a.FISH_TYPE in
(
    select FISH_TYPE
    from FISH_INFO
    group by FISH_TYPE
    having LENGTH = max(LENGTH)
)
order by a.ID