create table car_brands  (
id int primary key, 
title varchar (20)

);
INSERT IGNORE INTO car_brands values
  (1, 'Audi'), 
  (2, 'BMW'), 
  (3, 'Ford'), 
  (4, 'Porsche'), 
  (5, 'Fiat');
select * from car_brands;


create table  car_model(
model_id int primary key,
carBrandId int,
foreign key (carBrandId) references car_brands (id)
);

Alter table car_model
add title varchar(10);

INSERT IGNORE INTO car_model values
  (1, 1, 'TT'), 
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
    (13, 3, 'Fusion'),
    (14, 3, 'Mondeo'),
    (15, 3, 'Sierra'),
    (16, 4, '911'),
    (17, 4, 'Cayenne'),
    (18, 4, 'Panamera'),
    (19, 5, 'Palio'),
    (20, 5, 'Ducato'),
    (21, 5, 'Panda'),
    (22, 5, 'Punto'),
    (23, 5, 'Scudo');
select * from car_model;


create table  users(
id int primary key,
firstName varchar (20),
lastName varchar (20),
email varchar (20),
password varchar (20)
);
INSERT IGNORE INTO users values
  (01, "Test", "Test1", "Test1@gmail.com", "12345sa"),
  (02, "Test", "Test2", "Test2@gmail.com", "12345sa"),
  (03, "Test", "Test3", "Test3@gmail.com", "12345sa"),
  (04, "Test", "Test4", "Test4@gmail.com", "12345sa"), 
  (05, "Test", "Test5", "Test5@gmail.com", "12345sa");
select * from users;


create table  cars(
id int primary key,
userId int,
foreign key (userId) references users (id),
carBarndId int,
foreign key (carBarndId) references car_brands (id),
carModelId int,
foreign key (carModelId) references car_model (model_id)
);

Alter table cars
add millege int;

Alter table cars
add initialMillage int;