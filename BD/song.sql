CREATE TABLE cancion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(250) NOT NULL,
    artista VARCHAR(150) NOT NULL,
    anio INT NOT NULL,
    genero VARCHAR(20) NOT NULL,
    duracion INT NOT NULL
);