--CREATE TABLE IF NOT EXISTS tutorials (
--    id INT NOT NULL AUTO_INCREMENT,
--    title VARCHAR(255),
--    description VARCHAR(255),
--    published BOOLEAN,
--    PRIMARY KEY (id));


DROP TABLE IF EXISTS tutorials;

CREATE TABLE tutorials (
    title VARCHAR(255),
    description VARCHAR(255),
    published BOOLEAN
);

INSERT INTO tutorials (title, description, published)
VALUES
    ('Article 1', 'Description 1', true),
    ('Article 2', 'Description 2', false),
    ('Article 2', 'Copie du tutoriel 2', true),
    ('Article 3', 'Description 3', true);

--DROP TABLE IF EXISTS employees;
--
--CREATE TABLE employees (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  first_name VARCHAR(250) NOT NULL,
--  last_name VARCHAR(250) NOT NULL,
--  mail VARCHAR(250) NOT NULL,
--  password VARCHAR(250) NOT NULL
--);
--
--INSERT INTO employees (first_name, last_name, mail, password) VALUES
--  ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent'),
--  ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie'),
--  ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe');