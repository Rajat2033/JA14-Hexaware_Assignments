import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'parent_child_component';

  parentData:string='Hii I am Parent';

  // parentObj={};

  receivesChildData(data:any)
  {
   console.log(data)
  }
  
}
