
function validate (fname){
   
    var fname = document.getElementById('fname').value;
    var re = /[a-zA-Z]{2,20}/;
    var valid = re.test(fname);
    if (re.test(fname) == true )
    	alert("Мы услышим Вас");
    else 
   alert("Мы вас не слышим");   
}
function validate (email){
    var email = document.getElementById('email').value;
    var re =  /[a-zA-Z]{6,12}@(gmail\.com|ukr\.net)/;
    var valid = re.test(email);
   if (re.test(email) == true )
    	alert("Мы услышим Вас");
    else 
   alert("Мы вас не слышим");
}

function validate (phone){
    var phone = document.getElementById('phone').value;
    var re = /380(50|63|66|67|68|91|92|93|97|96)\d{7}/;
    var valid = re.test(phone);
   if (re.test(phone) == true )
    	alert("Мы услышим Вас");
    else 
   alert("Мы вас не слышим");
}
   
