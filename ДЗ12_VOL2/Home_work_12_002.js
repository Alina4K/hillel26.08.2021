function myCalculate() {
	document.getElementById("HW1");
	let a = document.getElementsByClassName('number_1')[0].value;
    let b = document.getElementsByClassName('number_2')[0].value;
	if(a % b == 0){
		alert("Делится " + (a / b));

	} else {
		alert("Делится с остатком" + " " + (a % b));
	}
}

function mySpruce() {
document.getElementById("HW2");
let lines = 7;
let str = " ";
let eur = "€";
for (let i = 0; i < lines; i++) {
  str += eur;
  console.log(str);
  }
alert("Нажмите на клавиатуре F12 (открыть Console.log) потом ОК");
}

function myColumn() {
document.getElementById("HW3");
let num = 0;
do {
if (num %2 !=0) {
document.write(num + '<br>');
}
num++;
} while(num <= 100)
}


function myNumber() {
let button = document.getElementById("button");
let result = document.getElementById("result");
let num = 1000;
for (num, i = 0; num > 50; i++) {

	num = num / 2;
    alert( num );
}
console.log(num, i);
result.innerHTML='Количество итераций: '+ i + '<br> Число которое получилось: ' + num;
document.getElementById("HW4");
}