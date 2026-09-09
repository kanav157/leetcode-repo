SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary 
FROM Department d
JOIN Employee e
ON e.departmentId = d.id

AND e.salary = (
    SELECT MAX(e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId
);