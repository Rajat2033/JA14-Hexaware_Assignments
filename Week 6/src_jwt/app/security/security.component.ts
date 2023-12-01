import { Component, OnInit } from '@angular/core';
import { JwtClientService } from '../jwt-client.service';
import { Token } from '@angular/compiler';

@Component({
  selector: 'app-security',
  templateUrl: './security.component.html',
  styleUrls: ['./security.component.css']
})
export class SecurityComponent implements OnInit{

  response:any;
  token:any;
  authRequest: any = {
    "username": "Ratna",
    "password": "ratna123"
  }
  constructor(private service: JwtClientService) { }
  ngOnInit(): void {
    this.getAccessToken(this.authRequest);
  }


  public getAccessToken(authRequest:any) {
     let response=this.service.getGeneratedToken(authRequest);
      response.subscribe((genToken)=>{this.token=genToken;
        console.log(genToken);this.accessApi(this.token)});
        
    }

    public accessApi(token:any){

      console.log(token);
      let response =    this.service.authorizationTest(token);
    
      response.subscribe( (responseData) => {this.response = responseData; console.log(responseData) });
    
      }
    
    
}
