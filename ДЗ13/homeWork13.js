function formValidation()
{
	var uname = document.registration.username;
	var uemail = document.registration.email;
	var uphone = document.registration.phone;

	if(!MyName(uname) || !ValidateEmail(uemail) || !ValidatePhone(uphone)){
		alert('Мы вас не слышим')
		return false;
	}
    alert('Мы вас слышим')
    return true;
	}



function MyName(uname)
{ 
var letters = /^[A-Za-z]{2,20}$/;
if(uname.value.match(letters))
{

return true;
}
else
{
alert("Поле 'Name' должно содержать от 2 до 20 символов / только английские");
uname.focus();
return false;
}

}

function ValidateEmail(uemail)
{ 
var mailformat = /^[A-Za-z]{6,12}@(?:gmail.com|ukr.net)$/;
if(uemail.value.match(mailformat))
{
return true;
}
else
{
uemail.focus();
alert("Поле 'Email' должно содержать 6 - 12 символов(англиские) до @ и потом почта gmail.com или ukr.net");
return false;
}
}

function ValidatePhone(uphone)
{ 
var uphoneformat = /^380(?:50|63|66|67|68|91|92|93|97|96)\d{7}/;
if(uphone.value.match(uphoneformat))
	
{
return true;
}

else
{
uphone.focus();
alert("Поле 'Phone' должно содержать 380 + 50|63|66|67|68|91|92|93|97| 96 + 7 цифр");
return false;
}
}