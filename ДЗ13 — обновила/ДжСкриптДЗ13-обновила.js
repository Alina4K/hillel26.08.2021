
///[a-zA-Z]{2-20}/;
///[a-zA-Z]{6-12}@(gmail\.com|ukr\.net)/;
///380(50|63|66|67|68|91|92|93|97|96)([0-9]{1-7})/;

function ValidOk(){
	let vname = /[a-zA-Z]{2-20}/;
	let iname = document.getElementById('i').value;
	let valname = iname.test(vname);

	let vemail = /[a-zA-Z]{6-12}@(gmail\.com|ukr\.net)/;
	let iemail = document.getElementById('email').value;
	let valemail = iemail.test(vemail);

	let vphone = /380(50|63|66|67|68|91|92|93|97|96)([0-9]{1-7})/;
	let iphone = document.getElementById(phone).value;
	let valphone = iphone.test(vphone);

	//mouseup
	
	let knop = document.querySelector("#submit");
	knop.addEventListener(type:'mouseup', ValidOk);

	if (valname=true && valemail=true && valphone=true) {
		alert("Мы услышим Вас");
	}
	else {alert("Мы Вас не слышим");
	}
}