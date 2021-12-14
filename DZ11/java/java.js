	function valid () {

	console.log('начало валидации');

	let userName = document.getElementById('name').value;
	let userEmail = document.getElementById('email').value;
	let userNumber = document.getElementById('number').value;
	let checkbox = document.getElementById('checkbox').value;

	let reName = /[a-zA-Z]{2,20}/;
	let validName = reName.test(userName);

	let reEmail = /[a-zA-Z]{6,12}@(gmail\.com|ukr\.net)/;
	let validEmail = reEmail.test(userEmail); 

	let reNumber = /380(50|63|66|67|68|91|92|93|97|96)\d{7}/;
    let validNumber = reNumber.test(userNumber);


	if (validNumber && validEmail && validName == true) {
		alert('Мы услышали вас');
		console.log('true');
	}
	
	else {
		alert('Мы вас не слышим');
		console.log('false');
	}

}

	document.addEventListener("DOMContentLoaded", function (){
	let sendButton = document.querySelector('.sendButton');	
	sendButton.addEventListener('click', function () {
		console.log('клик по кнопке и проверка валидации');
		valid(); // вызов функции валидации
	});
});




