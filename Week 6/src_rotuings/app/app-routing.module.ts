import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ContactComponent } from './components/contact/contact.component';
import { AboutComponent } from './components/about/about.component';
import { PaymentComponent } from './components/payment/payment.component';

const routes: Routes = [
  // {path:'',redirectTo:'home',pathMatch:'full'},
{path:'home',component:HomeComponent},
{path:'contact/:username',component:ContactComponent},
{path:'about',component:AboutComponent},
{path:'callnow',redirectTo:'contact/username'},
{path:'payment/:amount',component:PaymentComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
