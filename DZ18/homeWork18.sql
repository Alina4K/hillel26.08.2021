USE database_home;
 
CREATE TABLE carBrands (
		id int(5) not null,
		title enum ("Audi", "BMW", "Ford", "Porsche", "Fiat") not null,
		CHECK (id<=5)
);

CREATE TABLE carModel (
		id int(23),
		primary key (id),
		title enum("TT", "R8", "Q7", "A6", "A8", "3", "5", "X5", "X6", "Z3", 
		"Fiesta", "Focus", "Fusion", "Mondeo", "Sierra", "911", "Cayenne", 
		"Panamera", "Palio", "Ducato", "Panda", "Punto", "Scudo") not null,
		carBrandId int(5) not null,
		CHECK (id<=23),
		CHECK (carBrandId<=5),
		key carBrandId(carBrandId)
);

CREATE TABLE users (
		id int,
		firstName varchar(20) not null,
		lastName varchar(20) not null,
		password varchar(15) not null,
		primary key(id)
		-- CHECK (firstName<=20 AND firstName>=2)
		-- CHECK (lastName<=20 AND lastName>=2)
		-- CHECK (password<=15 AND password>=8)
);

 CREATE TABLE cars (
		id int,
		millege int,
		initialMileage int,
		userId int,
		carBrandId int,
		carModelId int,
		CHECK (millege<=999999),
		CHECK (initialMileage<=999999),
		foreign key(userId) references users(id),
		foreign key (carBrandId) references carModel(carBrandId),
		foreign key (carModelId) references carModel(id),
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
		(11, 'Fiesta', 3),
		(19, 'Palio', 5),
		(7, '5', 2),
		(16, '911', 4);
SELECT * FROM carModel;

INSERT INTO users VALUES 
		(101, "Вася", "Грааа.", "rsdasdasd"),
		(100, "Петя", "Раааа", "rsdasdasd123"),
		(102, "Олег", "Урааа", "rsdasdasd123");
SELECT * FROM users;

INSERT INTO cars VALUES
		(1, 100, 999999, 100, 3, 11),
		(2, 1000, 999999, 101, 5, 19),
		(3, 999999, 999999, 102, 4, 16);
SELECT * FROM cars;

drop table carBrands, carModel, users, cars;


--  drop table carBrands, carModel, users;
--  drop table carModel





