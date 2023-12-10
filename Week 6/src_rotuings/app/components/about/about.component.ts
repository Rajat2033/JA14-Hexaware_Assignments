import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent {
// param1:any;
// param2:any;
parameter:any=[];
  constructor(private route:ActivatedRoute)
  {
    // this.route.queryParams.subscribe((inputs)=>{this.param1=inputs['city'],this.param2=inputs['country']})
this.route.queryParams.subscribe((inputs)=> {this.parameter=[inputs['city'],inputs['country']]})
    
  }

}
