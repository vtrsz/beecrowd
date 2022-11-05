(
    SELECT 'Podium: ' || team AS name
    FROM league
    ORDER BY position ASC
    LIMIT 3
)
UNION ALL
(
    WITH t AS (
                SELECT *
                FROM league
                ORDER BY position DESC
                LIMIT 2
            )
    SELECT 'Demoted: ' || team AS name
    FROM t
    ORDER BY position ASC
)