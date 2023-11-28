import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular_templates';

  email: string = '';
  pwd: string = '';

  readFormData(data: any) {
    console.log(data.form.value);

  }
}
