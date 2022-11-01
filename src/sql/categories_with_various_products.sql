SELECT p.name, c.name
FROM categories c
INNER JOIN products p ON p.id_categories = c.id
WHERE p.amount > 100 AND p.id_categories IN(1, 2, 3, 6, 9)
ORDER BY c.id ASC;