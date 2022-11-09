SELECT lr.name, round(lr.omega::numeric * 1.618, 3) AS "The N Factor"
FROM life_registry lr
INNER JOIN dimensions dim ON lr.dimensions_id = dim.id
WHERE lr.name ILIKE ('Richard%') AND (dim.name LIKE ('C875') OR dim.name LIKE('C774'))
ORDER BY lr.omega ASC;