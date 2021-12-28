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


