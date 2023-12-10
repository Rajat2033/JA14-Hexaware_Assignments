import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DisplayallComponent } from './components/displayall/displayall.component';
import { AddcustomersComponent } from './components/addcustomers/addcustomers.component';
import { UpdatecustomersComponent } from './components/updatecustomers/updatecustomers.component';

const routes: Routes = [
{path:'displayall',component:DisplayallComponent},
{path:'addcustomer',component:AddcustomersComponent},
{path:'updatecustomer',component:UpdatecustomersComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
