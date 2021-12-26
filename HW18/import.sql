CREATE DATABASE IF NOT EXISTS hillel;
USE hillel;

DROP TABLE IF EXISTS car_brands;
CREATE TABLE car_brands
(
    id    bigint primary key,
    title enum ('Audi','BMW','Ford','Porsche','Fiat') not null
);

INSERT INTO car_brands
VALUES (1, 'Audi'),
       (2, 'BMW'),
       (3, 'Ford'),
       (4, 'Porsche'),
       (5, 'Fiat');

DROP TABLE IF EXISTS car_models;
CREATE TABLE car_models
(
    id           bigint primary key,
    car_brand_id bigint references car_brands (id),
    brand        enum ('TT','R8','Q7','A6','A8','3','5','X5','X6','Z3','Fiesta','Focus','Fusion','Mondeo','Sierra','911','Cayenne','Panamera','Palio','Ducato','Panda','Punto','Scudo') not null
);

INSERT INTO car_models
VALUES (1, 1, 'TT'),
       (2, 1, 'R8'),
       (3, 1, 'Q7'),
       (4, 1, 'A6'),
       (5, 1, 'A8'),
       (6, 2, '3'),
       (7, 2, '5'),
       (8, 2, 'X5'),
       (9, 2, 'X6'),
       (10, 2, 'Z3'),
       (11, 3, 'Fiesta'),
       (12, 3, 'Focus'),
       (13, 3, 'Fiesta'),
       (14, 3, 'Fusion'),
       (15, 3, 'Mondeo'),
       (16, 3, 'Sierra'),
       (17, 4, '911'),
       (18, 4, 'Cayenne'),
       (19, 4, 'Panamera'),
       (20, 5, 'Palio'),
       (21, 5, 'Ducato'),
       (22, 5, 'Panda'),
       (23, 5, 'Punto'),
       (24, 5, 'Scudo');

DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id         bigint primary key,
    first_name varchar(50)         not null,
    last_name  varchar(50)         not null,
    email      varchar(127) unique not null,
    password   varchar(127)        not null
);

INSERT INTO users
VALUES (1, 'UserA', 'UnknownA', 'user1@gmail.com', 'Password1'),
       (2, 'UserB', 'UnknownB', 'user2@gmail.com', 'Password2'),
       (3, 'UserC', 'UnknownC', 'user3@gmail.com', 'Password3'),
       (4, 'UserD', 'UnknownD', 'user4@gmail.com', 'Password4'),
       (5, 'UserE', 'UnknownE', 'user5@gmail.com', 'Password5');

DROP TABLE IF EXISTS cars;
CREATE TABLE cars
(
    id              bigint primary key,
    user_id         bigint references users (id),
    car_model_id    bigint references car_models (id),
    mileage         int not null,
    initial_mileage int not null
);

INSERT INTO cars
VALUES (1, 1, 1, 1000, 10),
       (2, 2, 2, 2000, 20),
       (3, 3, 3, 3000, 30),
       (4, 4, 4, 4000, 40),
       (5, 5, 5, 5000, 50),
       (6, 1, 6, 6000, 60),
       (7, 2, 7, 7000, 70);

SELECT *
FROM car_brands;

SELECT *
FROM car_models;

SELECT *
FROM users;

SELECT *
FROM cars;