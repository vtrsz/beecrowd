SELECT p.name
FROM products p
INNER JOIN providers prov ON prov.id = p.id_providers
WHERE prov.name LIKE 'P%' and p.amount BETWEEN 10 and 20;