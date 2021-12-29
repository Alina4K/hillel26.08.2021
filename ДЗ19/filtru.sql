###1. Найти владельцев у которых в имени есть последовательность букв am;
select firstName from users
where firstname like '%am%';

###2. Найти самый большой рассход среди Audi;
select max(millege),carBarndId  from cars
where carBarndId = 1;

###3. Найти количество моделей у брендов AUDI И BMW. Вывидите стоблцы count_models(количество моделей) и car_id(id бренда)
select count(model_id) as count_models, carBrandid 
from car_model
where carbrandid like 1 or carbrandid like 2
group by (carBrandid);

###4. Найдите количество владельцев по маркам и моделям автомобилей. Вывидите три стобца столбца car_model, car_barnd и user_count
select carModelId, carBarndId, count(userId) as user_count
from cars
group by (carModelId);

###5. Найти имена владельцев у которых есть машины;
select users.firstName
from users inner join cars on users.id = cars.userId;


select * from cars;



