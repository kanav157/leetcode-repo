# Write your MySQL query statement below
SELECT MAX(SALARY) AS SecondHighestSalary 
FROM Employee 
WHERE salary < (SELECT MAX(SALARY) FROM EMPLOYEE);