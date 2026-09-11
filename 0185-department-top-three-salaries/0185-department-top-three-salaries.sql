# Write your MySQL query statement below
SELECT d.name AS Department, E.name AS Employee , e.salary AS Salary
FROM Employee e
LEFT JOIN Department d
ON e.departmentId = d.id
WHERE 3 > (
    SELECT COUNT( DISTINCT e2.salary) FROM Employee e2
    WHERE e2.departmentId = e.departmentId
    AND e2.salary > e.salary
)