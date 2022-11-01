SELECT p.name, prov.name, p.price
FROM categories c
INNER JOIN products p ON p.id_categories = c.id
INNER JOIN providers prov ON p.id_providers = prov.id
WHERE c.name = 'Super Luxury'
AND p.price > 1000.00;