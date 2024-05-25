-- 코드를 작성해주세요
select a.ITEM_ID, a.ITEM_NAME, a.RARITY
from ITEM_INFO as a
join ITEM_TREE as b
on a.ITEM_ID = b.ITEM_ID
where b.PARENT_ITEM_ID IN (
    select A.ITEM_ID
    from ITEM_INFO A join ITEM_TREE B
    on A.ITEM_ID = B.ITEM_ID
    where A.RARITY = 'RARE'
)
order by a.ITEM_ID desc