let form = document.querySelector('.js-form'),
  formInputs = document.querySelectorAll('.js-input'),
  inputName = document.querySelector('.js-input.name'),
  inputLastname = document.querySelector('.js-input.lname'),
  inputEmail = document.querySelector('.js-input.email'),
  inputPhone = document.querySelector('.js-input.phone'),
  inputCheckbox = document.querySelector('.js-input.checkbox');


function validateName(name){
  let uname = /[a-zA-Z]{2,20}/
  return uname.test(String(name).toLowerCase());
}
const validateEmail = (email) => {
  let uemail = /[a-zA-Z]{6,12}@(gmail\.com|ukr\.net)/
  return  uemail.test(String(email).toLowerCase());
}
function validatePhone(phone){
  let uphone = /380(50|63|66|67|68|91|92|93|97|96)\d{7}/;
  return uphone.test(String(phone).toLowerCase());
}
form.onsubmit = function (event) {
  let fullValid = true;
  event.preventDefault();
  let emailVal = inputEmail.value,
    phoneVal = inputPhone.value,
    emptyInputs = Array.from(formInputs).filter(input => input.value === '');

  formInputs.forEach(function (input) {
    if (input.value === '') {
      input.classList.add('error');
      fullValid = false;
    } else {
      input.classList.remove('error');
    }
  });
  if (emptyInputs.length !== 0) {
    console.log('inputs not filled');
    return false;
  }
  if(!validateEmail(emailVal)) {
    console.log('email not valid');
    inputEmail.classList.add('error');
    fullValid = false;
  } else {
    inputEmail.classList.remove('error');
  }
  if (!validatePhone(phoneVal)) {
    console.log('phone not valid');
    inputPhone.classList.add('error');
    fullValid = false;
  } else {
    inputPhone.classList.remove('error');
  }

  if(!inputCheckbox.checked) {
    console.log('checkbox not checked');
    inputCheckbox.classList.add('error');
    fullValid = false;
  } else {
    inputCheckbox.classList.remove('error')
  }

  if ( fullValid ) {
    alert('Мы услышали вас');
  }
  else
  {
    alert('Мы вас не слышим');
  }

}

