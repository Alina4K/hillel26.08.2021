function calculate() {
	let a = document.getElementsByClassName('number_1')[0].value;
    let b = document.getElementsByClassName('number_2')[0].value;
	if(a % b == 0){
		alert("Делится " + (a / b));
	} else {
		alert("Делится с остатком" + " " + (a % b));
	}
}