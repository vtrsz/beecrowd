SELECT id, password, MD5(password) AS "password"
FROM account
ORDER BY id;