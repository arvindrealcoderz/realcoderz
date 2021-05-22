
	const form=document.getElementById('form');
	const usernameVal=document.getElementById('username');
	const passwordVal=document.getElementById('password');
	const cpasswordVal=document.getElementById('cpassword');

	//add event

	form.addEventListener('submit', (event) =>{
		event.preventDefault();
		validate();//call function
		// => fatarrow function
	})

	
	//define the validate function
	const validate = () => {
	const username=username.value.trim();
	const password=password.value.trim();
	const cpassword=cpassword.value.trim();
	

	//name validation
	if(usernameVal === ""){
		setErrorMsg(username,'name can not be blank');
	}else if(username.length <= 2){
		setErrorMsg(username,'name minimum 3 character');
	}else{
		setSuccessMsg(username);
	}

	//password validation
	if(passwordVal === ""){
		setErrorMsg(password,'password can not be null');
	}else if(passwordVal.length <= 5){
		setErrorMsg(password,'Minimum 6 character');
	}else{
		setSuccessMsg(password);
	}

	//confirm password validation
	if(cpasswordVal === ""){
		setErrorMsg(cpassword,'confirm password can not be null');
	}else if(passwordVal != cpasswordVal){
		setErrorMsg(cpassword,'password does not match');
	}else{
		setSuccessMsg(cpassword);
	}
}

	function setErrorMsg(input, errormsgs){
		var formControl = input.parentElement;
		var small = formControl.querySelector('small')
	//	form-control.className = "form-control error";
		small.innerText = errormsgs;
	}

	function setErrorMsg(input){
		var formControl = input.parentElement;
	//	form-control.className = "form-control success";
		
	}
	
