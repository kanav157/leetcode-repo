SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary 
FROM Department d , Employee e
WHERE d.id = e.departmentid
AND e.salary = (
    SELECT MAX(e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId
)