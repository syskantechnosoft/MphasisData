import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } 
from '@angular/forms';
@Component({
   selector: 'app-reactive',
   templateUrl: './reactive-form.component.html',
   styleUrls: ['./style.css'] 
})
export class ReactiveFormComponent { 
    isValidFormSubmitted: boolean = null;
	userForm = new FormGroup({
	   uname: new FormControl('', Validators.required),
	   gender: new FormControl('', Validators.required),
	   married: new FormControl(false),
	   tc: new FormControl('', Validators.required)
	});
	constructor() {
	}	
    onFormSubmit() {
	   this.isValidFormSubmitted = false;
	   if(this.userForm.invalid){
		  return;	
	   } 	
	   this.isValidFormSubmitted = true;	
	   console.log(this.userForm.valid);
	}
	reset() {
	   this.userForm.reset({
		    married: false
	   });	
	}	
	setDefaultValues() {
	   this.userForm.patchValue({uname: 'Krishna',
	    gender:'male', married:true});
	}	
}
	



