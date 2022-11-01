SELECT p.name, prov.name, c.name
FROM categories c
INNER JOIN products p ON p.id_categories = c.id
INNER JOIN providers prov ON p.id_providers = prov.id
WHERE c.name = 'Imported' and prov.name = 'Sansul SA';