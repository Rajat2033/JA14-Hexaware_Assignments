import { Component } from '@angular/core';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent {

  name: string = '';
  email: string = '';
  age: number = 0;
  contact: number = 0;
  gender:string='';

  getData(data: any) {

    console.log(data.form.value);
  }

}
