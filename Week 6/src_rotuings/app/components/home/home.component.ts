import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  amount: number = 0;

  constructor(private router: Router) { }

  getAmount() {

    this.router.navigate(['/payment/' + this.amount]);
    alert("Navigationg to payment from home component " + this.amount);

  }
}
