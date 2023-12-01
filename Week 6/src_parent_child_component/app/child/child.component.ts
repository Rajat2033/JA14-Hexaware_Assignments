import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input()
  parentInput: string = '';

  parentOutput: string = '';

  @Output()
  childOutputEmitter: EventEmitter<string> = new EventEmitter();

  childData: string = "Hii I am Rajat,I need joining ";

  ngOnInit() {
    console.log("Hello This is child component");
  }

  sendDataToParent() {
    this.childOutputEmitter.emit(this.childData);

  }


}
