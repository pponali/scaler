-- id should not be even number
-- description should not be 'boring'
-- order by rating desc
select * from cinema where id % 2 != 0 and description != 'boring' order by rating desc;