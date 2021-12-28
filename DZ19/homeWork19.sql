
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
	carBrandId int,
	foreign key(carBrandId) references carBrands(id),
	CHECK (id<=23),
	CHECK (carBrandId<=5)
);

CREATE TABLE users (
	id int,
	firstName varchar(20) not null,
	lastName varchar(20) not null,
	password varchar(15) not null,
	email nvarchar(320) not null,
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
	primary key(id)
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
	(100, "Вася", "Грааа.", "rsdasdasd", "olegche@gmail.com"),
	(101, "Петя", "Раааа", "rsdasdasd123", "olegche1@gmail.com"),
	(102, "Олег", "Урааа", "rsdasdasd123", "olegche2@gmail.com"),
	(103, "Гриша", "Ом", "rsdasdasd123", "olegche3@gmail.com"),
	(104, "Валг", "Ра", "rsdasdasd123", "olegche4@gmail.com"),
  	(105, "Миша", "Сила", "rsdasdasd123", "olegche5@gmail.com"),
	(106, "Laam", "Pampam", "rsdasdasd123", "olegche6@gmail.com"),
	(107, "Col", "Malam", "rsdasdasd123", "olegche7@gmail.com"),
	(108, "Amam", "La am", "rsdasdasd123", "olegche8@gmail.com"),
	(109, "Mala", "Brah", "rsdasdasd123", "olegche9@gmail.com");
SELECT * FROM users;
SELECT * FROM users where email like '%@%'; 

INSERT INTO cars VALUES
	(1, 100, 999999, 999999, 4, 1),
	(2, 101, 299999, 499999, 22, 5),
	(3, 102, 399999, 399999, 16, 4),
	(4, 103, 499999, 299999, 7, 2),
	(5, 104, 699999, 199999, 11, 3),
	(6, 105, 599999, 199999, 1, 1),
	(7, 106, 599999, 119999, 11, 3),
	(8, 107, 519999, 199999, 1, 1);
SELECT * FROM cars;

--  drop table carBrands, carModel, users, cars;

--  drop table cars;
--  drop table users;
--  drop table carBrands;
--  drop table carModel;


-- 2-ая часть -- 

-- №1 --
select users.id, users.firstName
from users 
where firstName like "%am%";

-- №2 --
-- У нас в таблице нет расхода, поэтому поставил пробег (millege)
select cars.userId, max(cars.millege) as millege, cars.carBrandId
from cars
where carBrandId in ('1'); 

-- №3 --
select carBrandId as car_id, count(carModel.id) as count_models
from carModel
where carBrandId in ('1', '3')
group by carBrandId;

-- №4 --
select count(cars.userId) as user_count, cars.carModelId as car_model, cars.carBrandId as car_barnd
from cars
group by carBrandId, carModelId
order by cars.userId desc;

-- №5 --
select cars.userId as user, cars.carBrandId as auto, users.firstName as name 
from cars inner join users on cars.userId = users.id  
where cars.userId having carBrandId










