/*
Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится'и результат деления,
иначе выведите 'Делится с остатком' и остаток от деления.
*/
console.log('Task1:')
let dividend = prompt('Enter the dividend number:', '');
let divider = prompt('Enter the divider:', '');
let remainderOfDivision = dividend%divider;
	if (dividend%divider == 0) {
		console.log('Divisible. Result : ' + (dividend / divider));
} 	else {
		console.log('Divisible with remainder. Remainder of the division : ' + (dividend % divider));
}

/*
2."нарисуйте" в консоли прямоугольный треугольник из звездочек
(или плюсиков, или какого другого символа):
на первой строчке - одна звездочка, на второй две, и так далее.
 Решение оформите в виде функции, куда передаются два параметра:
 высота треугольника и символ, которым его нужно "рисовать".
 Как-то так:
 drawTriangle(7,*);
*
**
***
****
******
*/
function drawTriangle(height, symbol) {
    let str = '';
    for (let a = 0; a < height; a++) {
        str += symbol;
        console.log(str);
    }
}

console.log('\n\nTask2:')
let height = prompt('Enter the triangle height:', '');
let symbol = prompt('Enter the symbol:', '');
drawTriangle(height, symbol);

/*
 Выведите столбец нечетных чисел в промежутке от 0 до 100.
*/
console.log('\n\nTask3:')
for (let i = 0; i <= 100; i++) {
    if (i % 2 === 1) {
        console.log(i);
    }
}

/*Дано число n = 1000. Делите его на 2 столько раз, пока результат
деления не станет меньше 50. Какое число получится?
Посчитайте количество итераций, необходимых для этого. Вывидите количество итераций и число которое получилось
*/
console.log('\n\nTask4:')
let value = 1000
let iterations = 0
do{
	value = value/2;
	iterations++
}
while (value >= 50);
console.log('Iterations: ' + iterations);
console.log('Result: ' + value);