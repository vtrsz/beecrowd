SELECT name, char_length(name) AS "Length"
FROM people
ORDER BY "Length" DESC;