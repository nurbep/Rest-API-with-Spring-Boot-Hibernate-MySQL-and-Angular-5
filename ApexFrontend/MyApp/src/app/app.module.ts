import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule,ReactiveFormsModule,FormGroup} from '@angular/forms';
import {Http, HttpModule, RequestOptions} from "@angular/http";

import { AppComponent } from './app.component';
import {AllComponent} from './all_appointments/all.component';
import {NewAppointment} from './new_appointment/new.component';
import {SearchAppointment} from './search/search.component';

import{AddAppointmentService,All,SearchAppointments} from './service/index';

@NgModule({
  declarations: [
    AppComponent, AllComponent,NewAppointment,SearchAppointment
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule
  ],
  providers: [All,AddAppointmentService,SearchAppointments],
  bootstrap: [AppComponent]
})
export class AppModule { }
