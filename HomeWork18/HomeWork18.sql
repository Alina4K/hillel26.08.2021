create table car_brands (
	id1 int ,
    primary key(id1),
    brand enum ('Audi','BMW','Ford','Porsche','Fiat') not null
);
insert into car_brands values
	(1, 'Audi'), 
	(2, 'BMW'), 
	(3, 'Ford'), 
	(4, 'Porsche'), 
	(5, 'Fiat');
select * from car_brands;
drop table car_brands;

create table car_models (
	id2 int ,
    primary key(id2),
    carBrandId int,
	foreign key(carBrandId) references car_brands(id1),
    brand enum ('TT','R8','Q7','A6','A8','3','5','X5','X6','Z3','Fiesta','Focus','Fusion','Mondeo','Sierra','911','Cayenne','Panamera','Palio','Ducato','Panda','Punto','Scudo') not null
);
insert into car_models values
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
select * from car_models;
drop table car_models;

create table users (
	usersId int,
    primary key (usersId),
	firstName varchar(33) not null,
	lastName varchar(33) not null,
    email varchar(33) unique not null,
    password varchar(33) not null
);
insert into users values
	(1, "Tomas", "Anderson", "Neo1@matrix.com", "matrix"),
	(2, "Tomas", "Anderson", "Neo2@matrix.com", "matrix"),
	(3, "Tomas", "Anderson", "Neo3@matrix.com", "matrix"),
	(4, "Tomas", "Anderson", "Neo4@matrix.com", "matrix"), 
	(5, "Tomas", "Anderson", "Neo5@matrix.com", "matrix"),
	(6, "Tomas", "Anderson", "Neo6@matrix.com", "matrix");
select * from users;
drop table users;

create table cars (
	id int,
    primary key (id),
    milliage int not null,
    initialMilliage int not null,
    check (milliage < initialMilliage),
    usersId int,
	foreign key(usersId) references users(usersId),
    carBrandId int,
	foreign key(carBrandId) references car_brands(id1),
    carModelId int,
	foreign key(carModelId) references car_models(id2)
);
insert into cars values
	(1, 11, 12, 1, 1, 1),
	(2, 21, 22, 2, 1, 2),
	(3, 31, 32, 3, 1, 3),
	(4, 41, 42, 4, 1, 4), 
	(5, 51, 52, 5, 1, 5),
    (6, 61, 62, 6, 2, 6);
    (7, 71, 72, 7, 2, 7);
select * from cars;
drop table cars;

	
    
	