-- 코드를 작성해주세요
select 
a.ITEM_ID,
a.ITEM_NAME,
a.RARITY
from ITEM_INFO a
left join ITEM_TREE b
on a.ITEM_ID = b.PARENT_ITEM_ID
where b.PARENT_ITEM_ID is null
order by a.ITEM_ID desc