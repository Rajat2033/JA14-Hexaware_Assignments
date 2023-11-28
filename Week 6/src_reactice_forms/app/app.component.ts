import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'reactice_template';
  //  !---Optional if we use this we donot need to assign value
  registerFormsGroup!: FormGroup;
  submitted = false;
  constructor(private formBuilder: FormBuilder) { }
  ngOnInit(): void {
    this.registerFormsGroup = this.formBuilder.group({
      firstName: ['',[ Validators.required,,Validators.minLength(6),Validators.maxLength(15)]],
      lastName: ['', Validators.required],
      emailId: ['',[Validators.required, Validators.email]]
      , password:['',[Validators.required,Validators.minLength(8),Validators.maxLength(10)]]
    });
  }
  get f() {
    return this.registerFormsGroup.controls;
  }

  onSubmit() {
    this.submitted=true;
    if(this.registerFormsGroup.invalid)
    {
      return ;
    }
    alert("Successful Registration")

  }

}
