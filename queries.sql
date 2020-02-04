## Part 1: Test it with SQL
id - int(11)
employer - varchar(255)
name - varchar(255)
skills - varchar(255)

## Part 2: Test it with SQL
SELECT name FROM employers
WHERE name="St. Louis";

## Part 3: Test it with SQL
DROP techjobs.job;

## Part 4: Test it with SQL
SELECT skill.name, skills.description FROM techjobs.skill
WHERE skillsjob IS NOT NULL
ORDER BY skill.name ASC;