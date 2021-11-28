let nameRegex = /^[a-zA-Z]{2,20}$/;
let mailRegex = /^[a-zA-Z0-9.]{6,12}@(gmail\.com|ukr\.net)$/;
let phoneRegex = /^380+(50|63|66|67|68|91|92|93|97|96)+[0-9]{7}$/;

function onClick() {
	let name = document.querySelector("#name").value;
	let mail = document.querySelector("#email").value;
	let phone = document.querySelector("#phone").value;

	if(nameRegex.test(name) && mailRegex.test(mail) && phoneRegex.test(phone)) {
		alert("We will hear you");
	} else {
		alert("We can't hear you");	
	}
}