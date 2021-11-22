let button = document.getElementById("button");
let result = document.getElementById("result");
let num = 1000;
for (num, i = 0; num > 50; i++) {

	num = num / 2;
    alert( num );
}
console.log(num, i);
result.innerHTML='Количество итераций: '+ i + '<br> Число которое получилось: ' + num;
