function DoWeHear (){
	if (nam===true && em===true && mob===true){
		alert ('Мы услышали вас');
	}
	else {alert('Мы вас не слышим');}
};

let poleName=document.getElementById('namee').value;
let relNam=/\D\w{2,20}/;
let nam=(poleName.search(relNam));

let poleEmaill=document.getElementById('emaill').value;
let relEm=/\D\w{6,12}@(gmail[.]com|ukr[.]net)/;
let em=(poleEmaill.search(relEm));

let poleMobile=document.getElementById('mobile').value;
let relMob=/380(50|63|66|67|68|91|92|93|97|96)\d{7}/;
let mob=(poleMobile.search(relMob));

let da=('Мы услышали вас');
let net=('Мы вас не слышим');
