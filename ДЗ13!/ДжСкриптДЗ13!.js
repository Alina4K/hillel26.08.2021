
///^[a-zA-Z]{2,20}$/;
///^[a-zA-Z]{6,12}@(gmail\.com|ukr\.net)$/;
///^(380(50|63|66|67|68|91|92|93|97|96)([0-9]{7}))$/;


	let vname = /^[a-zA-Z]{2,20}$/;
	let iname = document.getElementById('i').value;
	let valname = vname.test(iname);

	let vemail = /^[a-zA-Z]{6,12}@(gmail\.com|ukr\.net)$/;
	let iemail = document.getElementById('email').value;
	let valemail = vemail.test(iemail);

	let vphone = /^(380(50|63|66|67|68|91|92|93|97|96)([0-9]{7}))$/;
	let iphone = document.getElementById('phone').value;
	let valphone = vphone.test(iphone);

	//mouseup
	

	let knop = document.querySelector("#knop");
	knop.addEventListener('mouseup', ValidOk());
function ValidOk() {
	if (valname===true && valemail===true && valphone===true) {
		alert("Мы услышим Вас");
	}
	else {alert("Мы Вас не слышим");
	}

}