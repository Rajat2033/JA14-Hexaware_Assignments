import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent implements OnInit {
[x: string]: any;

  imgsrc = "./assets/virat.png";
  id: number = 0;
  name: string = '';

 styleColour="pink";
  player:any;
  playerList = [

    {
      id: 1,
      name: "virat",

    },
    {
      id: 2,
      name: "Rohit",
    },
    {
      id: 3,
      name: "Rahul",
    }
  ]


ngOnInit(): void {
  console.log('OnInit() Initialized');
}

getData(): any
{
  alert(this.id + " => " + this.name);

}



}
