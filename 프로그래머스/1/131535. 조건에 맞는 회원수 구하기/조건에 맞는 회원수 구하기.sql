-- 코드를 입력하세요 count(AGE) as USERS
SELECT count(age) as 'USERS' from USER_INFO where age>=20 and age<=29 and date_format(JOINED, '%Y') = '2021';