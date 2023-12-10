import { Component } from '@angular/core';
import { Customers } from 'src/app/model/Customers';
import { CustomersService } from 'src/app/services/customers.service';

@Component({
  selector: 'app-displayall',
  templateUrl: './displayall.component.html',
  styleUrls: ['./displayall.component.css']
})
export class DisplayallComponent {


  customerList:Customers[]=[];
  constructor(private service:CustomersService){}


  displayAllData()
  {
    this.service.getAllCustomers().subscribe((list:Customers[])=>{this.customerList=list})
  }

}
