SELECT products.name, providers.name
FROM products, providers
WHERE products.id_providers = providers.id
AND providers.name LIKE 'Ajax SA';