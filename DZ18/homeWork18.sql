USE database_home;
 
CREATE TABLE carBrands (
	id int(5),
	primary key(id),
	title enum ("Audi", "BMW", "Ford", "Porsche", "Fiat") not null,
	CHECK (id<=5)
);

CREATE TABLE carModel (
	id int(23),
	primary key(id),
	title enum("TT", "R8", "Q7", "A6", "A8", "3", "5", "X5", "X6", "Z3", 
	"Fiesta", "Focus", "Fusion", "Mondeo", "Sierra", "911", "Cayenne", 
	"Panamera", "Palio", "Ducato", "Panda", "Punto", "Scudo") not null,
	carBrandId int(5) not null,
	CHECK (id<=23),
	CHECK (carBrandId<=5)
);

CREATE TABLE users (
	id int,
	firstName varchar(20) not null,
	lastName varchar(20) not null,
	password varchar(15) not null,
	primary key(id)
);

 CREATE TABLE cars (
	id int,
	userId int,
    millege int,
	initialMileage int,
	carModelId int,
	carBrandId int,
	CHECK (millege<=999999),
	CHECK (initialMileage<=999999),
	foreign key(userId) references users(id),
	foreign key(carBrandId) references carBrands(id),
	foreign key(carModelId) references carModel(id),
	primary key(id, userId) -- на всякий :)
 );

INSERT INTO carBrands VALUES 
	(1, 'Audi'), 
	(2, 'BMW'), 
	(3, 'Ford'), 
	(4, 'Porsche'), 
	(5, 'Fiat');
SELECT * FROM carBrands;

INSERT INTO carModel VALUES 
	(1, 'TT', 1),
	(2, 'R8', 1),
	(3, 'Q7', 1),
	(4, 'A6', 1),
	(5, 'A8', 1),
	(6, '3', 2),
	(7, '5', 2),
	(8, 'X5', 2),
	(9, 'X6', 2),
	(10, 'Z3', 2),
	(11, 'Fiesta', 3),
	(12, 'Focus', 3),
	(13, 'Fusion', 3),
	(14, 'Mondeo', 3),
	(15, 'Sierra', 3),
	(16, '911', 4),
	(17, 'Cayenne', 4),
	(18, 'Panamera', 4),
	(19, 'Palio', 5),
	(20, 'Ducato', 5),
	(21, 'Panda', 5),
	(22, 'Punto', 5),
	(23, 'Scudo', 5);
SELECT * FROM carModel;

INSERT INTO users VALUES 
	(100, "Вася", "Грааа.", "rsdasdasd"),
	(101, "Петя", "Раааа", "rsdasdasd123"),
	(102, "Олег", "Урааа", "rsdasdasd123"),
    (103, "Гриша", "Ом", "rsdasdasd123"),
	(104, "Валяг", "Ра", "rsdasdasd123"),
    (105, "Мишаг", "Сила", "rsdasdasd123");
SELECT * FROM users;

INSERT INTO cars VALUES
	(1, 100, 199999, 599999, 4, 1),
	(2, 101, 299999, 499999, 22, 5),
	(3, 102, 399999, 399999, 16, 4),
	(4, 103, 499999, 299999, 7, 2),
    (5, 104, 599999, 199999, 11, 3);
SELECT * FROM cars;

drop table carBrands, carModel, users, cars;

--  drop table cars
--  drop table users
--  drop table carBrands
--  drop table carModel





