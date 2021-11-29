
function validate (){

var fn = document.getElementById('fname')
var fname = fn.value
var Result = /[a-zA-Z]{2,20}/.test(fname)
console.log(fname,Result)

var em = document.getElementById('email')
var email = em.value
var searchResult1 = /[a-zA-Z]{6,12}@(gmail\.com|ukr\.net)/.test(email)
console.log(email,Result1)

var ph = document.getElementById('phone')
var phone = ph.value
var searchResult2 = /380(50|63|66|67|68|91|92|93|97|96)\d{7}/.test(phone)
console.log(phone,Result2)

if (Result && Result1 && Result2) {
		alert("Мы услышим Вас")
	} else{
		alert("Мы вас не слышим")
 }
}
