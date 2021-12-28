create table  car_model(
model_id int primary key,
carBrandId int,
foreign key (carBrandId) references car_brands (id)
);

Alter table car_model
add title varchar(10);

create table  users(
id int primary key,
firstName varchar (20),
lastName varchar (20),
email varchar (20),
password varchar (20)
);

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

insert into cars values (2,1,2,6,100,50);
select * from cars;


