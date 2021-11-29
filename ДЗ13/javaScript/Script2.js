
function validate (){


    var re = /[a-zA-Z]{2,20}/;
    var fname = document.getElementById('fname').value;
    var valid = re.test(fname);
   
    var re =  /[a-zA-Z]{6,12}@(gmail\.com|ukr\.net)/;
    var email = document.getElementById('email').value;
    var valid = re.test(email);
   

    var re = /380(50|63|66|67|68|91|92|93|97|96)\d{7}/;
    var phone = document.getElementById('phone').value;
    var valid = re.test(phone);
    
    

if (fname && email && phone)
	alert("Мы услышим Вас");
    else 
    alert("Мы вас не слышим");
}
