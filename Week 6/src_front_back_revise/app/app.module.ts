import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddcustomersComponent } from './components/addcustomers/addcustomers.component';
import { DisplayallComponent } from './components/displayall/displayall.component';
import { UpdatecustomersComponent } from './components/updatecustomers/updatecustomers.component';
import { FormsModule } from '@angular/forms';
import { HomedashboardComponent } from './components/homedashboard/homedashboard.component';
import { CustomersService } from './services/customers.service';

@NgModule({
  declarations: [
    AppComponent,
    AddcustomersComponent,
    DisplayallComponent,
    UpdatecustomersComponent,
    HomedashboardComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
