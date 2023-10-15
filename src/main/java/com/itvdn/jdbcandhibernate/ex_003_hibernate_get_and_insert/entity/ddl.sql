CREATE DATABASE library;

USE library;

DROP TABLE author;
DROP TABLE book;

CREATE TABLE author
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(45)
);
CREATE TABLE book
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(45),
    author_id INT(11)
);

Select * FROM author;