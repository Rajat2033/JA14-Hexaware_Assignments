import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customers } from '../model/Customers';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class CustomersService {
 baseUrl="http://localhost:8080/api/customers/"
  constructor(private http: HttpClient) { }


  addCustomers() {

  }

  deleteCustomerById() {

  }
  getAllCustomers():Observable<Customers[]> {

    return this.http.get<Customers[]>(this.baseUrl+'getall')

  }
  getCustomerById() {

  }

  updateCustomer() {

  }
}
