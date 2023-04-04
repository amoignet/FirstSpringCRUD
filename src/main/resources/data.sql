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
