
CREATE TABLE IF NOT EXISTS libros(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,

);

INSERT INTO libros (titulo) VALUES
    ('100 años de soledad'),
    ('La divina comedia'),
    ('WTF con el SAT')
