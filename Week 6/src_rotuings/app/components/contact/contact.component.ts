import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent {
username:string='';
  constructor(private route: ActivatedRoute) {
    route.params.subscribe((params) => { this.username=params['username'] });
  }
}
