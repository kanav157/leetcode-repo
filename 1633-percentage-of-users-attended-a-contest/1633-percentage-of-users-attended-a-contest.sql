# Write your MySQL query statement below
SELECT r.contest_id ,
ROUND((COUNT(r.contest_id)/(SELECT COUNT(*) FROM USERS) )*100.0 , 2) AS percentage
FROM Users u , Register r
WHERE u.user_id =r.user_id
GROUP BY r.contest_id
ORDER BY percentage DESC , r.contest_id ASC