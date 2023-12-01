import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtClientService {
  baseUrl: string = "http://localhost:8080/products/";
  constructor(private http: HttpClient) { }

  getGeneratedToken(requestBody: any) {
    return this.http.post(this.baseUrl + "authenticate", requestBody, { responseType: 'text' as 'json' });
  }

  authorizationTest(token: any) {
    let tokenString = "Bearer " + token;
    const headers = new HttpHeaders().set("Authorization", tokenString);
    console.log(token);
    console.log(headers);
    return this.http.get(this.baseUrl + "getall", { headers, responseType: 'text' as 'json' });

  }
}
