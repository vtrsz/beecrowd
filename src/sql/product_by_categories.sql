SELECT categories.name, sum(products.amount)
FROM products
INNER JOIN categories on products.id_categories = categories.id
GROUP BY categories.name;