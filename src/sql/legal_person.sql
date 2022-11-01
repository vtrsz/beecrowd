SELECT c.name
FROM legal_person lp
INNER JOIN customers c ON lp.id_customers = c.id;