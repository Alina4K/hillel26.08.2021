CREATE TABLE IF NOT EXISTS car_brands (
	id_car_brands int,
    primary key(id_car_brands),
    title enum ('Audi','BMW','Ford','Porsche','Fiat') not null
);
INSERT IGNORE INTO car_brands values
	(1, 'Audi'), 
	(2, 'BMW'), 
	(3, 'Ford'), 
	(4, 'Porsche'), 
	(5, 'Fiat');
select * from car_brands;





CREATE TABLE IF NOT EXISTS car_models (
    id_car_models int,
	primary key(id_car_models),
    carBrandId int,
foreign key(carBrandId) references car_brands(id_car_brands),
   brand enum ('TT','R8','Q7','A6','A8','3','5','X5','X6','Z3','Fiesta','Focus','Fusion','Mondeo','Sierra','911','Cayenne',
   'Panamera','Palio','Ducato','Panda','Punto','Scudo') not null
);
INSERT IGNORE INTO car_models values
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
select * from car_models;




CREATE TABLE IF NOT EXISTS users (
	Id_users int,
    primary key (Id_users),
	firstName varchar(11) not null,
	lastName varchar(11) not null,
    email varchar(11) not null,
    password varchar(11) not null
);
INSERT IGNORE INTO users values
	(01, "Yuri", "Linsky1", "Linsky1@gmail.com", "qwerty123"),
	(02, "Yuri", "Linsky2", "Linsky2@gmail.com", "qwerty123"),
	(03, "Yuri", "Linsky3", "Linsky3@gmail.com", "qwerty123"),
	(04, "Yuri", "Linsky4", "Linsky4@gmail.com", "qwerty123"), 
	(05, "Yuri", "Linsky5", "Linsky5@gmail.com", "qwerty123");
select * from users;
