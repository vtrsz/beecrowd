SELECT name, round((salary::numeric * 0.10), 2) AS "tax"
FROM people
WHERE salary > 3000;